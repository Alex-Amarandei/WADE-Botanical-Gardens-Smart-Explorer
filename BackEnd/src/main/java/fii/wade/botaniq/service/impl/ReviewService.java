package fii.wade.botaniq.service.impl;

import fii.wade.botaniq.model.impl.Review;
import fii.wade.botaniq.repository.impl.ReviewRepository;
import fii.wade.botaniq.service.BaseService;
import java.util.Optional;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class ReviewService implements BaseService<Review> {

  private ReviewRepository reviewRepository;

  @Override
  public Review create(Review review) {

    return reviewRepository.save(review);
  }

  @Override
  public Optional<Review> read(String id) {

    return reviewRepository.findById(id, Review.class);
  }

  @Override
  public Optional<Review> update(String id, Review review) {

    return reviewRepository.updateById(id, review, Review.class);
  }

  @Override
  public void delete(String id) {

    reviewRepository.findById(id, Review.class).ifPresent(user -> reviewRepository.delete(user));
  }
}
