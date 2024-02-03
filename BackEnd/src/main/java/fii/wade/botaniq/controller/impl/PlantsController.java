package fii.wade.botaniq.controller.impl;

import fii.wade.botaniq.controller.BaseController;
import fii.wade.botaniq.model.impl.Plant;
import fii.wade.botaniq.service.impl.PlantService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Getter
@RestController
@RequestMapping(path = "/plants")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class PlantsController extends BaseController<Plant, PlantService> {}
