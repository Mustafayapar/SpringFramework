package com.mustafaypr.qualifier2;


@QualifierMultiple2(EFazlaSecenekler.IKINCI)
public class Patron3 implements PatronInterface {

    @Override
    public String surum(String data){
        return "QualifierMultiple ENUM IKINCI: "+data;
    }
}
