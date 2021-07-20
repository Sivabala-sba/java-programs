package com.program;
import java.util.Scanner;

public class Errortry4
{
    public static void main(String[] args){
        scanner obj1= new Scanner(System.in);System.out.println("Enter the first number:");
        int first= obj1.nextInt();
        System.out.println("first number is: "+ first);
        Scanner obj2= new scanner(System.in);System.out.println("Enter the second number:");
        int second= obj2.nextInt();
        System.out.println("second number is: "+ second);
        int sum = first + second;
        System.out.println("The sum is: " + sum);

    }
}
