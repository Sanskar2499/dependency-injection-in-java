package com.sf.beans;

public class Student {

    private String name;
    private int rollNo;
    private String email;
    private Address address;

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void display(){
        System.out.println("Roll no" + this.rollNo);
        System.out.println("Name" + this.name);
        System.out.println("email" + this.email);
        System.out.println("Address" + this.address);
    }
}
