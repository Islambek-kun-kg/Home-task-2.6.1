package com.company;

public class Main {

    public static void main(String[] args) {
        Num<Integer> num1 = new Num<>(1);
        Num<Integer> num2 = new Num<>(111);
        Num<Double> num3 = new Num<>(1.1);
        Num<Double> num4 = new Num<>(111.111);
        Num<Float> num5 = new Num<>(1.1F);
        Num<Float> num6 = new Num<>(111.111F);

        System.out.println(num1.num());
        System.out.println(num2.num());
        System.out.println(num3.num());
        System.out.println(num4.num());
        System.out.println(num5.num());
        System.out.println(num6.num());
    }
}
