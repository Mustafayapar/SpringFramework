package com.mustafaypr.qualifier2;


@QualifierMultiple2(EFazlaSecenekler.BIRINCI)
public class Patron2 implements PatronInterface {

    @Override
    public String surum(String data){
        return "QualifierMultiple ENUM BIRINCI: "+data;
    }
}
