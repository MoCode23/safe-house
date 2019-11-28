package org.launchcode.safehouse.models;


import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class House {

    private int houseId;
    private static int nextId =1;
    @NotNull
    @Size(min=1, message = "You must fill in your address.")
    private String address;
    private HouseState state;

    @NotNull
    @Min(value = 5, message = "Your zip code must be at at least 5 digits.")
    private String zip;
    @NotNull
    @Size(min=1, message = "You must fill in your email address.")
    @Email
    private String email;

    public House(int id, String address, String zip, String email) {
        this();
        this.houseId = id;
        this.address = address;
        this.zip = zip;
        this.email = email;
    }

    public House(){
        houseId = nextId;
        nextId++;
    }
    public int getHouseId() {
        return houseId;
    }

    public void setHouseId(int houseId) {
        this.houseId = houseId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public HouseState getState() {
        return state;
    }

    public void setState(HouseState state) {
        this.state = state;
    }
}