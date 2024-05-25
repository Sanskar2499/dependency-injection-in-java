package com.sf.beans;
import java.lang.String;

public class Address {
    private int houseNo;
    private String cityString;
    private int pincode;

    public void setCityString(String cityString) {
        this.cityString = cityString;
    }

    public void setHouseNo(int houseNo) {
        this.houseNo = houseNo;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

    public String toString(){
        return "#" + houseNo + ", " + cityString + pincode;
    }
}
