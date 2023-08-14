package model;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;



//@Embeddable //Embedded class volt de átalakítottam önálló entitássá-->@Entity
@Entity
@Table(name = "addresses")
public class Address /*implements Serializable */{

    //@Serial
    //private static final long serialVersionUID = 1L;
    @Id
    private int id;

    private String city;
    private int zipcode;
    private String street;

    @Column(name = "house_number")
    private int houseNumber;

    public Address(String city, int zipcode, String street, int houseNumber) {
        this.city = city;
        this.zipcode = zipcode;
        this.street = street;
        this.houseNumber = houseNumber;
    }

    public Address() {}


    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getZipcode() {
        return zipcode;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }



    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", zipcode=" + zipcode +
                ", street='" + street + '\'' +
                ", houseNumber=" + houseNumber +
                '}';
    }
}
