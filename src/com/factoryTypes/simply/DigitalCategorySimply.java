package com.factoryTypes.simply;

public class DigitalCategorySimply extends CategorySImply{
    public BookSimply newBookSimply(){
        return new DigitalBookSImply();
    }

}
