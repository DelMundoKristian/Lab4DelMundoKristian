package com.delmundo.myapplication;

public class AndroidVer {
    private int logo;
    private String name, Country, Industry, CEO, Description;

    public AndroidVer(int logo, String name, String country, String industry, String CEO, String description) {
        this.logo = logo;
        this.name = name;
        this.Country = country;
        this.Industry = industry;
        this.CEO = CEO;
        this.Description = description;


    }

    public int getLogo() {
        return logo;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return Country;
    }

    public String getIndustry() {
        return Industry;
    }

    public String getCEO() {
        return CEO;
    }

    public String getDescription() {
        return Description;
    }
}
