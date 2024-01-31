package com.botaniq.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Location {
    private String city;
    private String county;
    private String country;
    private String streetName;
    private String postalCode;
    private Coordinates coordinates;
    private String googleMapsLink;
}
