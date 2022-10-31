package org.example;

public class Matematika {

    public static double faktorijel(double n){
        double x = 1;
        for(int i = 1; i <= n; i++){
            x *= i;
        }
        return x;
    }

    public static double sinus(double n){
        double x = 0;
        double broj = 1;
        for(int i = 1; i <=5; i++){
            x += (Math.pow(-1, i+1) * Math.pow(n, broj)/faktorijel(broj));
                    broj += 2;
        }
        return x;
    }

}
