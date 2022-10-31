package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double n = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Unesite broj: ");
        n = in.nextDouble();
        System.out.println(Matematika.faktorijel(n));
        System.out.println(Matematika.sinus(n));
    }
}