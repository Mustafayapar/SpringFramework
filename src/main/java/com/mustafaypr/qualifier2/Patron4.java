package com.mustafaypr.qualifier2;


@QualifierMultiple2(EFazlaSecenekler.UCUNCU)
public class Patron4 implements PatronInterface {

    @Override
    public String surum(String data){
        return "QualifierMultiple ENUM UNUCU: "+data;
    }
}
