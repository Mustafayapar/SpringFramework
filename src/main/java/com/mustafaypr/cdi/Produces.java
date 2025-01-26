package com.mustafaypr.cdi;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;

import java.util.ArrayList;
import java.util.List;

@Named(value = "producesTutorial")
@ApplicationScoped
public class Produces {

    @jakarta.enterprise.inject.Produces
    public List<String> getList() {
        List<String> liste = new ArrayList<String>();
         liste.add("java");
         liste.add("c");
         liste.add("c++");
         liste.add("html5");
         liste.add("js");
         liste.add("css5");
        return liste;
    }
}
