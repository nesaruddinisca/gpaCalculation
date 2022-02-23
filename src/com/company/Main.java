package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num;
        System.out.println("Enter your GPA Number:");
        num = input.nextDouble();

        if (num >= 80) {
            System.out.println("A+");
        } else if (num >= 70) {
            System.out.println("A");
        } else if (num >= 60) {
            System.out.println("A-");
        } else if (num >= 50) {
            System.out.println("B");
        } else if (num >= 40) {
            System.out.println("C");
        } else {
            System.out.println("Fail");
        }
    }
}
