package org.emp;

import java.util.Scanner;

public class StringOperation {
    public static void main(String[] args){
        StringOperation a = new StringOperation();
        //a.printChar();
        //a.occuranceCount();
        a.lastOccur();
    }
    public void printChar(){
        Scanner getInput = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String input = getInput.nextLine();
        //System.out.println(input);
        for(int i=0; i<input.length(); i++){
            System.out.println(input.charAt(i));
        }
    }
    public void occuranceCount(){
        Scanner getInput = new Scanner(System.in);
        System.out.println("Enter the String here: ");
        String strInput = getInput.nextLine();
        System.out.println("Enter the character here: ");
        String strchrInput = getInput.next();
        //char chrInput = strchrInput.charAt(0);
        //System.out.println(strInput);
        //System.out.println(chrInput);
        boolean result = strInput.contains(strchrInput);
        if (result == true){
            System.out.println("Character available");
        }
        else{
            System.out.println("Character not available");
        }

    }
    public void lastOccur(){
        Scanner getInput = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = getInput.nextLine();
        System.out.println("Enter the character: ");
        char c = getInput.next().charAt(0);
        String strChar = String.valueOf(c);
        int result = str.lastIndexOf(strChar);
        //System.out.println("The last index of the char is: " + result);
        if(result >= 0){
            System.out.println("The last index of the given char is: " + result);
        }
        else{
            System.out.println("Sorry, the given char is not present in the string!!");
        }
    }
}
