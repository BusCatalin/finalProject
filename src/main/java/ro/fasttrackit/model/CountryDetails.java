package ro.fasttrackit.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class CountryDetails {
    @Id
    @GeneratedValue
    private int id;
    private String capital;
    private double population;
    private String currency;
    @OneToOne
    private Country country;

    public CountryDetails() {
    }

    public CountryDetails(String capital, double population, String currency) {
        this.capital = capital;
        this.population = population;
        this.currency = currency;
    }

    public CountryDetails(int id, String capital, double population, String currency) {
        this.id = id;
        this.capital = capital;
        this.population = population;
        this.currency = currency;

    }

    public int getId() {
        return id;
    }

    public String getCapital() {
        return capital;
    }

    public double getPopulation() {
        return population;
    }

    public String getCurrency() {
        return currency;
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public void setPopulation(double population) {
        this.population = population;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }


    @Override
    public String toString() {
        return "CountryDetails{" +
                "id=" + id +
                ", capital='" + capital + '\'' +
                ", population=" + population +
                ", currency='" + currency + '\'' +
                '}';
    }
}
