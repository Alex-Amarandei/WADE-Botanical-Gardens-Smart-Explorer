package fii.wade.botaniq.controller.impl;

import fii.wade.botaniq.controller.BaseController;
import fii.wade.botaniq.model.impl.Review;
import fii.wade.botaniq.service.impl.ReviewService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Getter
@RestController
@RequestMapping(path = "/reviews")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class ReviewsController extends BaseController<Review, ReviewService> {}
