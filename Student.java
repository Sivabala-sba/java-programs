package com.java.selfexamples;
//This is an other example of default constructor
//But this displays the default values

public class Student {
    //int id;
    //String name;

    //method to display the value of id and name
    void display(int id, String name){
        System.out.println(id+" "+name);
    }

    public static void main(String[] args){
        //creating objects
        Student s1 = new Student();
        Student s2 = new Student();

        //displaying values of the object
        s1.display(5413, "siva");
        s2.display(5412, "bala");
    }
}
