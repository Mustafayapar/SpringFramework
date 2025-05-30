package com.mustafaypr.bean;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;
import lombok.Getter;
import lombok.Setter;

@Named(value="cdiBean")
@ApplicationScoped
@Setter
@Getter
public class JsfBean {

    private String message;

    public JsfBean() {
        this.message = "Spring Framework Bean";
    }
}
