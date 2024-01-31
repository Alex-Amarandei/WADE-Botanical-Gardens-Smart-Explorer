package com.botaniq.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Review {
    private String id;
    private String reviewDescription;
    private String authorUsername;
    private String itemId;
}
