package fii.wade.botaniq.controller.impl;

import fii.wade.botaniq.controller.BaseController;
import fii.wade.botaniq.model.impl.Exhibition;
import fii.wade.botaniq.model.impl.Garden;
import fii.wade.botaniq.service.impl.ExhibitionService;
import fii.wade.botaniq.service.impl.GardenService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Getter
@RestController
@RequestMapping(path = "/gardens")
public class GardensController extends BaseController<Garden, GardenService> {

    @Autowired
    private ExhibitionService exhibitionService;

    public GardensController(GardenService service) {
        super(service);
    }

    @GetMapping(path = "/{gardenId}/exhibitions/{exhibitionName}")
    public ResponseEntity<Exhibition> getExhibitionByNameAndGardenId(@PathVariable("gardenId") String gardenId, @PathVariable("exhibitionName") String exhibitionName) {
        return new ResponseEntity<>(exhibitionService.getExhibitionById(gardenId, exhibitionName), HttpStatus.OK);
    }
}
