package com.mustafaypr.cdi;

import com.mustafaypr.StudentDTO;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Produces;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import lombok.Getter;

@ApplicationScoped
@Named(value = "newTutorial")
public class NewT{

    @Produces
    public String uretilenData( StudentDTO studentDTO){

        studentDTO = studentDTO.builder().studentId(0).studentName("student name").build();
    return studentDTO.getStudentName();
    }

    @Getter
    @Inject
    public String tüketilenData;
}
