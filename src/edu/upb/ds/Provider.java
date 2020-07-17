package edu.upb.ds;

public class Provider {
    private String name;
    private String city;
    private long numArticles;

    public Provider(){}

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

    public Provider(String name, String city, long numArticles) {
        this.name = name;
        this.city = city;
        this.numArticles = numArticles;
    }
}
