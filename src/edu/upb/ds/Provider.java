package edu.upb.ds;
//###################################
//Provider class
//###################################
//Welcome to the provider's class!
public class Provider {
    //###################################
    //Attributes
    //###################################
    //These are the main attributes to use on the program.
    private String name;
    private String city;
    private long numArticles;
    //###################################
    //Empty constructor
    //###################################
    public Provider(){}

    //###################################
    //Constructor
    //###################################
    public Provider(String name, String city, long numArticles) {
        this.name = name;
        this.city = city;
        this.numArticles = numArticles;
    }
    //###################################
    //Getters/Setters
    //###################################
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public double getNumArticles() {
        return numArticles;
    }

    public void setNumArticles(long numArticles) {
        this.numArticles = numArticles;
    }


}
//Developed by Pedro Felipe Gomez / ID:000396221