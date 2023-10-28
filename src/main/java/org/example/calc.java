package org.example;

public class calc {
    public int summ(int a, int b){
        int result;
        result = a + b;
        System.out.println("сумма " + a + " и " + b + " = " + result);
        return result;
    }

    public  int subtract(int a, int b){
    int result = a -b;
    System.out.println("разность " + a + " и " + b + " = " + result);
    return result;
    }
}