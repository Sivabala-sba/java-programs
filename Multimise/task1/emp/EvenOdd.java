package org.emp;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args){
        EvenOdd z = new EvenOdd();
        //z.getResult();
        z.loopResult();
    }
    public int getResult(){
        Scanner getInput = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int a = getInput.nextInt();
        if(a%2==0){
            System.out.println("The entered number is even!!");
        }
        else{
            System.out.println("The entered number is odd!!");
        }
        return 0;
    }
    public int loopResult(){
        int even=0;
        int odd=0;
        Scanner getInput = new Scanner(System.in);
        System.out.println("Enter the initial value: ");
        int startVal = getInput.nextInt();
        System.out.println("Enter the final value: ");
        int finalVal = getInput.nextInt();
        for(int i=startVal; i<finalVal; i++){
            if(i%2==0){
                System.out.println(i + " is even");
                even++;
            }
            else{
                System.out.println(i + " is odd");
                odd++;
            }
        }
        System.out.println("total even number is: " + even);
        System.out.println("total odd number is: " + odd);
        return 0;
    }
}
