package fii.wade.botaniq.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Plant {
    private String id;
    private String name;
    private String description;
    //private List<Photos> photos;
    private String season;
    private String plantHabit;
    private String lifeCycle;
    private String soilPreferences;
    private String gardenOrgUrl;
}
