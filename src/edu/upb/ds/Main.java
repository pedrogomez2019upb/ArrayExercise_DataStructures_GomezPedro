package edu.upb.ds;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean programExit=false;
        ArrayList<Prov> listProvider= new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while(!programExit) {
            int option=0;
        System.out.println("\n############################");
        System.out.println("\nWelcome to the Provider Panel Control");
        System.out.println("\n############################");
        System.out.println("\nPlease Select an option:");
        System.out.println("\n1:See Provider");
        System.out.println("\n2:Change city name");
        System.out.println("\n3:Create Provider");
        System.out.println("\n4:Delete Provider");
        System.out.println("\n5:See All Provider");
        System.out.println("\n6:Close");
        option = sc.nextInt();
            if (option == 1) {
                System.out.println("Option 1");
            } else if (option == 2) {
                System.out.println("\n############################");
                System.out.println("\nChange Provider's City");
                System.out.println("\n############################");
                System.out.println("\nPlease provide a name:");
                String temporalName=sc.nextLine();
                for(int i=0;i<listProvider.size();i++){
                    Prov b=listProvider.get(i);
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
                Prov a = new Prov();
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
            else if (option==4){
                System.out.println("Option 4");
            }
            else if (option==5){
                for(int i=0;i<listProvider.size();i++){
                    System.out.println("\nProvider number : "+(i+1));
                    Prov provider5=listProvider.get(i);
                    System.out.println("\nName: "+provider5.getName());
                    System.out.println("\nCity: "+provider5.getCity());
                    System.out.println("\nArticles: "+provider5.getNumArticles());
                }
            }
            else if (option==6){
                break;
            }
        }
        System.out.println("\n############################");
        System.out.println("\nThanks for using the Provider Panel Control");
        System.out.println("\n############################");
    }
}
