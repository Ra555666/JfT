package org.ramus.javafundamentals.mainTask;

import java.util.Scanner;

public class MTaskFundamentals {
//    String name;
    Scanner read;

    public void greeting(String name){

        System.out.println("Greeting " + name);
    }


    public void revert(String name) {
        StringBuilder sb = new StringBuilder(name);

        System.out.print("Reversed name is: ");
        System.out.println(sb.reverse().toString());
    }
}
