package com.mustafaypr.cdi;

import jakarta.enterprise.context.ApplicationScoped;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

//Cdi==bean
@jakarta.inject.Named(value = "namedTutorial")
@ApplicationScoped
public class Named {

    private Long namedId;
    private  String namedData="Hello Named Tutorial  ";
}
