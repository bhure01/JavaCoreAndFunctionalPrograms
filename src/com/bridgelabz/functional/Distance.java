package com.bridgelabz.functional;
import java.util.*;
import java.lang.Math;

public class Distance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x and y:");
        int x = sc.nextInt();
        int y = sc.nextInt();
        euclideanDistance(x,y);

    }
    static void euclideanDistance(int x, int y) {
        System.out.println(Math.sqrt((x * x) + (y * y)));
    }
}
