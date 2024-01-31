package com.botaniq.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class Exhibition {
    private String id;
    private String name;
    private String date;
    private String description;
    private List<Plant> plantList;
    //private List<Photo> photos;
    private List<String> resources;
    private String socialMediaLink;
}
