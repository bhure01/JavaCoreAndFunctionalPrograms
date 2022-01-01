package com.bridgelabz.core;

import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String[] args) {
        int num;
        double sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        num = sc.nextInt();

        for (int i = 1; i <= num; i++ ) {
            System.out.println("1/"+i+"+");
            sum = sum + (double) 1/i;
        }
        System.out.println("Sum of Harmonic numbers is:" +sum);
    }
}



/*package com.bridgelabz.core;

import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        num = sc.nextInt();
        double harmonic = harmonicNumber(num);
        System.out.println("Harmonic number till range " + num + " " + harmonic + " ");
        sc.close();
    }
    static double harmonicNumber(int num) {
        double harmonic = 0;
        for( double i = 1; i <= num; i++) {
            harmonic += (1/i);
            System.out.println(harmonic);
        }
        return harmonic;
    }
}
*/