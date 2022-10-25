/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.neu.assignment_2.model;

/**
 *
 * @author shubhamjain
 */
import java.util.ArrayList;

public class House {
    private int houseNo;
    private String houseName;
    private String ownerName;
    private Community community;
    private City city;
    private static ArrayList<House> houseList = new ArrayList<>();

    public House(int houseNo, String houseName, String ownerName, Community community, City city) {
        this.houseNo = houseNo;
        this.houseName = houseName;
        this.ownerName = ownerName;
        this.community = community;
        this.city = city;
    }

    public void addToHouseList(){
        houseList.add(this);
    }

    public int getHouseNo() {
        return houseNo;
    }

    public String getHouseName() {
        return houseName;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public Community getCommunity() {
        return community;
    }

    public City getCity() {
        return city;
    }

    public static ArrayList<House> getHouseList() {
        return houseList;
    }
    

    
}
