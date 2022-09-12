package org.emp;

import java.net.StandardSocketOptions;
import java.util.Locale;

public class stringExamples {
    public static void main(String[] args){
        String S = "Dinesh";
        String T = "Kumar";
        System.out.println(S);
        System.out.println(S.toLowerCase());
        System.out.println(S.toUpperCase().charAt(3));
        System.out.println(S.charAt(0));
        System.out.println(S);
        char c = S.charAt(2);
        String str = String.valueOf(c);
        System.out.println(c);
        System.out.println(S.contains("y"));
        System.out.println(S.concat(" kumar"));
        System.out.println(S.endsWith("h"));
        System.out.println(S.equals(S));
        String S1 = "Dinesh";
        String S2 = new String("Dinesh");
        System.out.println(S==S1);
        System.out.println(S==S2);
        System.out.println(S.equals(S2));
        System.out.println(S.length());
        //String str = Character.toString(c);
        //System.out.println(c);
    }
}
