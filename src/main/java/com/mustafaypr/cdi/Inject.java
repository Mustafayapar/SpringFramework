package com.mustafaypr.cdi;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;

import java.util.List;

@Named(value = "injectTutorial")
@ApplicationScoped
public class Inject {

    @jakarta.inject.Inject
    List<String> tuketen;

    public List<String> getTuketen() {
        return tuketen;
    }
}
