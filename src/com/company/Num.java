package com.company;

public class Num<N extends Number> implements Intable<N> {

    private N number;


    public Num(N number) {
        this.number = number;
    }


    @Override
    public N num() {
        return number;
    }

}