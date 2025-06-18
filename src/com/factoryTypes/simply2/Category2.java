package com.factoryTypes.simply2;

public class Category2 {
    private String name;
    private int type;

    public Book2 newBook(int typeBook){
        switch (typeBook){
            case 1:
                return new DefautBook();
            case 2:
                return new FisicalBook2();
            case 3:
                return new DigitalBook2();
            default:
                throw new IllegalArgumentException();
        }

    }
}
