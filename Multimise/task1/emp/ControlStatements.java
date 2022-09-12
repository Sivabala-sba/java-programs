package org.emp;

import java.util.Scanner;

public class ControlStatements {
    public static void main(String[] args){
        ControlStatements d = new ControlStatements();
        //d.IfElse();
        //d.ForLoop();
        System.out.println("Enter your choice:\n1. IfElse\n2. ForLoop");
        Scanner getInput = new Scanner(System.in);
        int input = getInput.nextInt();
        if(input==1){
            d.IfElse();
        }
        else if(input==2){
            d.ForLoop();
        }
        else{
            System.out.println("Invalid input :(");
        }
    }

    public void IfElse(){
        //int n = 5;
        System.out.println("Enter a number: ");
        Scanner getInput = new Scanner(System.in);
        int n = getInput.nextInt();
        if(n==5){
            System.out.println("Welcome :)");
        }
        else{
            System.out.println("The input is not 5 :(");
        }
    }

    public void ForLoop(){
        Scanner getInput = new Scanner(System.in);
        System.out.println("Enter the starting range: ");
        int j = getInput.nextInt();
        System.out.println("Enter the final range: ");
        int k = getInput.nextInt();
        for(int i=j; i<k; i++){
            System.out.println("Loop No." + i);
        }
    }
}
