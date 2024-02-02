package fii.wade.botaniq.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Event {
    private String id;
    private String name;
    private String date;
    private String description;
    private int people;
    private boolean ticket;
    //private List<Photos> photos;
    private String socialMediaLinks;
}
