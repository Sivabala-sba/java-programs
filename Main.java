package com.company;

import java.util.Scanner;
//This program will get a input from the user and will give the output as whether the input number is positive or negative.
public class Main {

    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=number.nextInt();
        if(num>0){
            System.out.println("The Number is positive");
        }
        else if(num<0){
            System.out.println("The number is negative");
        }
        else{
            System.out.println("The number is zero");
        }
    }
}
