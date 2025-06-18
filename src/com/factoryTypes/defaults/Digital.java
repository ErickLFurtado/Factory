package com.factoryTypes.defaults;

public class Digital implements Category{
    @Override
    public Book newBook(){
        return new DigitalBook();
    }
}
