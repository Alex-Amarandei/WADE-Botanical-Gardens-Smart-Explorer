package fii.wade.botaniq.controller.impl;

import fii.wade.botaniq.controller.BaseController;
import fii.wade.botaniq.model.impl.Exhibition;
import fii.wade.botaniq.service.impl.ExhibitionService;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Getter
@RestController
@RequestMapping(path = "/exhibitions")
public class ExhibitionsController extends BaseController<Exhibition, ExhibitionService> {
    public ExhibitionsController(ExhibitionService service) {
        super(service);
    }
}
