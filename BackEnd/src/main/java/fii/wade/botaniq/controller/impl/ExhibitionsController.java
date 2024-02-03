package fii.wade.botaniq.controller.impl;

import fii.wade.botaniq.controller.BaseController;
import fii.wade.botaniq.model.impl.Exhibition;
import fii.wade.botaniq.service.impl.ExhibitionService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Getter
@RestController
@RequestMapping(path = "/exhibitions")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class ExhibitionsController extends BaseController<Exhibition, ExhibitionService> {}
