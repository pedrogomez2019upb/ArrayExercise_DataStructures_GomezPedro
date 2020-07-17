package edu.upb.ds;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int option=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("\n############################");
        System.out.println("\nWelcome to the Provider Panel Control");
        System.out.println("\n############################");
        System.out.println("\nPlease Select an option:");
        System.out.println("\n1:See Provider:");
        System.out.println("\n2:Change city name;");
        System.out.println("\n3:Create Provider:");
        System.out.println("\n4:Delete Provider");
        option=sc.nextInt();
    }
}
