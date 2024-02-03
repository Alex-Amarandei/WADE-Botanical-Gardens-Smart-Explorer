package fii.wade.botaniq.controller.impl;

import fii.wade.botaniq.controller.BaseController;
import fii.wade.botaniq.model.impl.Garden;
import fii.wade.botaniq.service.impl.GardenService;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Getter
@RestController
@RequestMapping(path = "/gardens")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class GardensController extends BaseController<Garden, GardenService> {}
