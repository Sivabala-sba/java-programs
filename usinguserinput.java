package com.program;
import java.util.Scanner;

public class usinguserinput {
    public static void main(String[] args) {
        Scanner myObj1= new Scanner(System.in);
        System.out.println("Enter username");

        String username= myObj1.nextLine();
        System.out.println("username is: "+ username);

        Scanner myObj= new Scanner(System.in);
        System.out.println("Enter name, age and salary:");

        //String input
        String name=myObj.nextLine();

        //Numerical input
        int age= myObj.nextInt();
        double salary= myObj.nextDouble();

        //Output input by user
        System.out.println("Name: " + name);
        System.out.println("Age: "+age);
        System.out.println("Salary: "+salary);

    }
}
