package fii.wade.botaniq.service.impl;

import fii.wade.botaniq.model.impl.Exhibition;
import fii.wade.botaniq.repository.impl.ExhibitionRepository;
import fii.wade.botaniq.service.BaseService;
import java.util.Optional;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class ExhibitionService implements BaseService<Exhibition> {

  private ExhibitionRepository exhibitionRepository;

  @Override
  public Exhibition create(Exhibition exhibition) {

    return exhibitionRepository.save(exhibition);
  }

  @Override
  public Optional<Exhibition> read(String id) {

    return exhibitionRepository.findById(id, Exhibition.class);
  }

  @Override
  public Optional<Exhibition> update(String id, Exhibition exhibition) {

    return exhibitionRepository.updateById(id, exhibition, Exhibition.class);
  }

  @Override
  public void delete(String id) {

    exhibitionRepository
        .findById(id, Exhibition.class)
        .ifPresent(exhibition -> exhibitionRepository.delete(exhibition));
  }
}
