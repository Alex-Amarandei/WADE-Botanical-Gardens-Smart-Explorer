package fii.wade.botaniq.service.impl;

import fii.wade.botaniq.model.Exhibition;
import fii.wade.botaniq.model.entry.impl.Garden;
import fii.wade.botaniq.repository.impl.GardenRepository;
import java.util.NoSuchElementException;
import java.util.Objects;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class ExhibitionService {
    private GardenRepository gardenRepository;

    public Exhibition getExhibitionById(String gardenId, String exhibitionName){
        Garden garden = gardenRepository.findById(gardenId, Garden.class).orElse(null);
        if(garden == null)
            throw new NoSuchElementException("Nu exista fra");
        return garden.getExhibitionList().stream()
                .filter(e -> Objects.equals(exhibitionName, e.getName()))
                .findFirst()
                .orElse(null);
    }
}
