package edu.upb.ds;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int option=0;
        while(option!=5) {
        ArrayList<Provider> listProvider= new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("\n############################");
        System.out.println("\nWelcome to the Provider Panel Control");
        System.out.println("\n############################");
        System.out.println("\nPlease Select an option:");
        System.out.println("\n1:See Provider");
        System.out.println("\n2:Change city name");
        System.out.println("\n3:Create Provider");
        System.out.println("\n4:Delete Provider");
        System.out.println("\n5:Close");
        option = Integer.parseInt(sc.nextLine());

            if (option == 1) {
                System.out.println("Option 1");
            } else if (option == 2) {
                System.out.println("\n############################");
                System.out.println("\nChange Provider's City");
                System.out.println("\n############################");
                System.out.println("\nPlease provide a name:");
                String temporalName=sc.nextLine();
                for(int i=0;i<listProvider.size();i++){
                    Provider b=listProvider.get(i);
                    if(temporalName.equals(b.getName())){
                        System.out.println("\nPlease provide a new city:");
                        String temporalCity= sc.nextLine();
                        b.setCity(temporalCity);
                        System.out.println("\nModified Successfully the new city for:");
                        System.out.println("\nName:" + b.getName());
                        System.out.println("\nCity:" + b.getCity());
                        System.out.println("\nArticles:" + b.getNumArticles());
                    }
                }
            } else if (option == 3) {
                Provider a = new Provider();
                System.out.println("\n############################");
                System.out.println("\nProvider Creator");
                System.out.println("\n############################");
                System.out.println("\nPlease provide a name:");
                a.setName(sc.nextLine());
                System.out.println("\nPlease provide the city where is located:");
                a.setCity(sc.nextLine());
                System.out.println("\nPlease provide the number of articles:");
                a.setNumArticles(sc.nextLong());
                listProvider.add(a);
                System.out.println("\nCreated Successfully the new provider:");
                System.out.println("\nName:" + a.getName());
                System.out.println("\nCity:" + a.getCity());
                System.out.println("\nArticles:" + a.getNumArticles());
            }
        }
        System.out.println("\n############################");
        System.out.println("\nThanks for using the Provider Panel Control");
        System.out.println("\n############################");
    }

}
