package org.emp;
import java.util.Scanner;

public class Maths {
    public static void main(String[] args){
        Maths x = new Maths();
        int y = x.add();
        System.out.println("The sum of given to number is: " + y);
        int w = x.multi();
        System.out.println("The product of given to number is: " + w);
    }
    public int add(){
        Scanner getInput = new Scanner(System.in);
        System.out.println("Enter the first number to perform addition: ");
        int a = getInput.nextInt();
        System.out.println(("Enter the second number to perform addition: "));
        int b = getInput.nextInt();
        return a+b;
        //System.out.println("The sum of given to number is: " + (a+b));
    }
    public int multi(){
        Scanner getInput = new Scanner(System.in);
        System.out.println("Enter the first number to perform multiplication: ");
        int c = getInput.nextInt();
        System.out.println("Enter the second number to perform multiplication: ");
        int d = getInput.nextInt();
        return c*d;
        //System.out.println("The product of given to number is: " + (c*d));
    }
}
