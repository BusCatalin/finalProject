package ro.fasttrackit.model;

import javax.persistence.*;

@Entity
public class Country {
    @Id
    @GeneratedValue
    private int id;

    private String name;
    private String continent;
    private String capital;
    private long area;
    private String currency;

    public Country() {
    }

    public Country(int id, String name, String continent,String capital,long area, String currency) {
        this.id = id;
        this.name = name;
        this.continent = continent;
        this.capital=capital;
        this.area=area;
        this.currency=currency;
    }

    public Country(String name, String continent,String capital,long area, String currency) {
        this.name = name;
        this.continent = continent;
        this.capital=capital;
        this.area=area;
        this.currency=currency;
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

    public String getCapital() {
        return capital;
    }

    public long getArea() {
        return area;
    }

    public String getCurrency() {
        return currency;
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

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public void setArea(long area) {

    }

    public void setCurrency(String currency) {
        this.currency = currency;
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
