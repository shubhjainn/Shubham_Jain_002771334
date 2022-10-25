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

public class Community {
    private int communityNo;
    private String communityName;
    private String pinCode;
    private City city;
    private static ArrayList<Community> communityList = new ArrayList<>();

    public Community(int communityNo, String communityName, String pinCode, City city) {
        this.communityNo = communityNo;
        this.communityName = communityName;
        this.pinCode = pinCode;
        this.city = city;
    }
    public void addToCommunityList(){
        communityList.add(this);
              
    }

    public int getCommunityNo() {
        return communityNo;
    }

    public String getCommunityName() {
        return communityName;
    }

    public String getPinCode() {
        return pinCode;
    }

    public City getCity() {
        return city;
    }

    public static ArrayList<Community> getCommunityList() {
        return communityList;
    }
    
    
}
