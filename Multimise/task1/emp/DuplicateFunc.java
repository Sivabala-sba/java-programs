package org.emp;

import java.util.Scanner;

public class DuplicateFunc {
    public static void main(String[] args){
        DuplicateFunc a = new DuplicateFunc();
        a.dupCount();
    }
    public void dupCount(){
        Scanner getInput = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String inputStr = getInput.nextLine();
        System.out.println("Enter the char to get it's count: ");
        char inputChar = getInput.next().charAt(0);
        int flag = 0;
        int charLen = inputStr.length();
        for(int i=0; i<charLen; i++){
            if(inputStr.charAt(i)==inputChar){
                flag++;
            }
        }
        System.out.println(inputChar + " was repeated for " + flag);
    }
    public void remDup(){
        Scanner getInput = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String input = getInput.nextLine();
        char str[] = input.toCharArray();
        int len = input.length();
        int index = 0;
        for(int i=0; i<len; i++){
            int j;
            for(j=0; j<i; j++){
                if(str[i]==str[j]){
                    break;
                }
            }
            if(j==i){

            }
        }
    }
}
