package org.launchcode.safehouse.models;


public class House {

    private int houseId;
    private static int nextId =1;
    private String address;

    public House(String address, int zip, String email) {
    }

    /*public enum state {
        AL, AK, AZ, AR, CA, CO, CT, DE, FL, GA, HI, ID, IL, IN, IA, KS, KY, LA, ME, MD, MA, MI, MN, MS, MO,
        MT, NE, NV, NH, NJ, NM, NY, NC, ND, OH, OK, OR, PA, RI, SC, SD, TN, TX, UT, VT, VA, WA, WV, WI, WY;
    }*/

    private String zip;
    private String email;

    public House(int id, String address, String zip, String email) {
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
}