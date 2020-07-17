package edu.upb.ds;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean programExit=false;
        ArrayList<Provider> listProvider= new ArrayList<>();
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
        System.out.println("\n6:Change Article");
        System.out.println("\n7:Close");
        option = sc.nextInt();
            if (option == 1) {
                System.out.println("\n############################");
                System.out.println("\nSee Provider");
                System.out.println("\n############################");
                System.out.println("\nPlease provide a name:");
                String temporalName=sc.next().toString();
                for(int i=0;i<listProvider.size();i++){
                    Provider provider1=listProvider.get(i);
                    if(temporalName.equals(provider1.getName())){
                        System.out.println("\n############################");
                        System.out.println("\nProvider info");
                        System.out.println("\n############################");
                        System.out.println("\nName:" + provider1.getName());
                        System.out.println("\nCity:" + provider1.getCity());
                        System.out.println("\nArticles:" + provider1.getNumArticles());
                    }
                }
            } else if (option == 2) {
                System.out.println("\n############################");
                System.out.println("\nChange Provider's City");
                System.out.println("\n############################");
                System.out.println("\nPlease provide a name:");
                sc.nextLine();
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
                a.setName(sc.next().toString());
                System.out.println("\nPlease provide the city where is located:");
                a.setCity(sc.next().toString());
                System.out.println("\nPlease provide the number of articles:");
                a.setNumArticles(sc.nextLong());
                listProvider.add(a);
                System.out.println("\nCreated Successfully the new provider:");
                System.out.println("\nName:" + a.getName());
                System.out.println("\nCity:" + a.getCity());
                System.out.println("\nArticles:" + a.getNumArticles());
            }
            else if (option==4){
                System.out.println("\n############################");
                System.out.println("\nRemove Provider");
                System.out.println("\n############################");
                System.out.println("\nPlease provide a name:");
                String temporalName=sc.next().toString();
                for(int i=0;i<listProvider.size();i++){
                    Provider provider4=listProvider.get(i);
                    if(temporalName.equals(provider4.getName())){
                        listProvider.remove(i);
                        System.out.println("\nDeleted Successfully the old provider!");
                    }
                }
            }
            else if (option==5){
                for(int i=0;i<listProvider.size();i++){
                    System.out.println("\n############################");
                    System.out.println("\nProvider number : "+(i+1));
                    System.out.println("\n############################");
                    Provider provider5=listProvider.get(i);
                    System.out.println("\nName: "+provider5.getName());
                    System.out.println("\nCity: "+provider5.getCity());
                    System.out.println("\nArticles: "+provider5.getNumArticles());
                }
            }
            else if (option==6){
                System.out.println("\n############################");
                System.out.println("\nChange Provider's Articles");
                System.out.println("\n############################");
                System.out.println("\nPlease provide a name:");
                sc.nextLine();
                String temporalName=sc.nextLine();
                for(int i=0;i<listProvider.size();i++){
                    Provider provider6=listProvider.get(i);
                    if(temporalName.equals(provider6.getName())){
                        System.out.println("\nPlease provide the articles's procedure (Out=-number -- In=+number):");
                        String procedureArticle= sc.nextLine();
                        long articlesProvider= (long) provider6.getNumArticles();
                        long procedureArticleDouble=Long.parseLong(procedureArticle);
                        long newNumber=procedureArticleDouble+articlesProvider;
                        provider6.setNumArticles(newNumber);
                        System.out.println("\nModified Successfully the new article for:");
                        System.out.println("\nName:" + provider6.getName());
                        System.out.println("\nCity:" + provider6.getCity());
                        System.out.println("\nArticles:" + provider6.getNumArticles());
                    }
                }
            }
            else if(option==7){
                break;
            }
        }
        System.out.println("\n############################");
        System.out.println("\nThanks for using the Provider Panel Control");
        System.out.println("\n############################");
    }
}
