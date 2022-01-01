package com.bridgelabz.core;

import java.util.Scanner;

public class FindEvenOddNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to check whether it is a even or odd");
        int num = input.nextInt();
        checkEvenOrOdd(num);
    }
    public static void checkEvenOrOdd(int num) {
        if(num % 2 == 0) {      // if remainder is 0 then it is even
            System.out.println("The given number " +num+ " is Even");
        } else {
            System.out.println("The given number " +num+" is Odd");
        }
    }
}
