package ro.fasttrackit.model;

import javax.persistence.*;

@Entity
public class Country {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String continent;
    @OneToOne(cascade = CascadeType.ALL)
    private CountryDetails countryDetails;

    public Country() {
    }

    public Country(int id, String name, String continent,CountryDetails countryDetails) {
        this.id = id;
        this.name = name;
        this.continent = continent;
        this.countryDetails=countryDetails;
    }

    public Country(String name, String continent,CountryDetails countryDetails) {
        this.name = name;
        this.continent = continent;
        this.countryDetails=countryDetails;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getContinent() {
        return continent;
    }

    public CountryDetails getCountryDetails() {
        return countryDetails;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public void setCountryDetails(CountryDetails countryDetails) {
        this.countryDetails = countryDetails;
    }

    @Override
    public String toString() {
        return "Country{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", continent='" + continent + '\'' +
                '}';
    }
}
