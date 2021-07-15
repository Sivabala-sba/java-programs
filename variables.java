package com.program;

public class variables {
    public static void main(String[] args) {
        //This program is done to refer the variables in Java

        String name="John";
        System.out.println(name);

        int myNum=15;
        System.out.println(myNum);

        int myNum1;
        myNum1=15;
        System.out.println(myNum1);

        int myNum2=15;
        myNum2=20; //myNum2 value is now 20
        System.out.println(myNum2);

        //A demonstration to declare variables of other types
        int myNum3=5;
        float myFloatNum=5.99f;
        char myLetter='D';
        boolean myBool=true;
        String myText="Hello";

        //Combining both text and variable using + character
        String name1="John";
        System.out.println("Hello "+name1);

        String firstname="John";
        String lastname="Doe";
        String fullname= firstname+lastname;
        System.out.println(fullname);

        // In numeric value, the + operator works as a mathematical operator
        int a=5;
        int b=6;
        System.out.println(a+b);

        int c=5, d=6, e=50;
        System.out.println(c+d+e);
    }
}
