package com.java.selfexamples;

/*public class Constructors {
    Constructors(){
        System.out.println("Welcome");
    }

    public static void main(String[] args){
        Constructors obj = new Constructors();
    }
}*/

public class Constructors {
    Constructors(String name, int code){
        System.out.println("Welcome");
        String collegeName = name;
        int collegeCode = code;
        System.out.println("College name is :" + collegeName);
        System.out.println("College code is :" + collegeCode);
    }

    public static void main(String[] args){
        Constructors obj = new Constructors("siva", 5413);
    }
}
