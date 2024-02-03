package fii.wade.botaniq.repository;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBSaveExpression;
import com.amazonaws.services.dynamodbv2.model.AttributeValue;
import com.amazonaws.services.dynamodbv2.model.ComparisonOperator;
import com.amazonaws.services.dynamodbv2.model.ExpectedAttributeValue;
import fii.wade.botaniq.model.BaseEntry;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
@SuperBuilder
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public abstract class BaseRepository<T extends BaseEntry> {

  protected final DynamoDBMapper dynamoDBMapper;

  public T save(T entry) {

    dynamoDBMapper.save(entry);
    return entry;
  }

  public Optional<T> findById(String id, Class<T> clazz) {

    T entry = dynamoDBMapper.load(clazz, id);
    return Optional.ofNullable(entry);
  }

  public Optional<T> findByPartitionKeyAndSortKey(
      String partitionKey, String sortKey, Class<T> clazz) {

    T entry = dynamoDBMapper.load(clazz, partitionKey, sortKey);
    return Optional.ofNullable(entry);
  }

  public T update(String partitionKey, String sortKey, T updatedEntry, Class<T> clazz) {

    Optional<T> entry = findByPartitionKeyAndSortKey(partitionKey, sortKey, clazz);

    if (entry.isPresent()) {
      dynamoDBMapper.save(
          updatedEntry,
          new DynamoDBSaveExpression()
              .withExpectedEntry(
                  "id",
                  new ExpectedAttributeValue(
                          new AttributeValue().withS(String.valueOf(partitionKey)))
                      .withComparisonOperator(ComparisonOperator.EQ)));
      return updatedEntry;
    } else {
      return null;
    }
  }

  public T updateById(String id, T updatedEntry, Class<T> clazz) {

    Optional<T> entry = findById(id, clazz);

    if (entry.isPresent()) {
      dynamoDBMapper.save(
              updatedEntry,
              new DynamoDBSaveExpression()
                      .withExpectedEntry(
                              "id",
                              new ExpectedAttributeValue(
                                      new AttributeValue().withS(String.valueOf(id)))
                                      .withComparisonOperator(ComparisonOperator.EQ)));
      return updatedEntry;
    } else {
      return null;
    }
  }

  public void delete(T entry) {

    dynamoDBMapper.delete(entry);
  }
}
