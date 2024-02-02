package fii.wade.botaniq.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class Garden {
    private String id;
    private String name;
    private String description;
    private Location location;
    private List<Event> eventList;
    private List<Exhibition> exhibitionList;
    //private List<Photos> photos;
    private List<String> resources;
}
