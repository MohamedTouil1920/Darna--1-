package com.example.Darna.web.models;


    import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class clientForm {
    
    private Long cin;
    private String name;
    private Date date_naissance;
    private String genre;

}
