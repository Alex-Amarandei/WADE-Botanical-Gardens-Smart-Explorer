package com.botaniq.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class User {
    private String firstName;
    private String lastName;
    private String birthday;
    private String username;
    private String password;
    private String email;
    private String phone;
    private String role;
    //private List<Photos> photos;
}
