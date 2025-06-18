package com.factoryTypes.defaults;

public class Fisical implements Category {
    @Override
    public Book newBook(){
        return new FisicalBook();
    }
}
