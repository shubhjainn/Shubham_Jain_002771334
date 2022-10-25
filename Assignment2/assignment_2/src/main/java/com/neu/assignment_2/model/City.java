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
public class City {
    private int cityNo;
    private String cityName;
    private String cityState;
    private static ArrayList<City> cityList = new ArrayList<>();

    public City(int cityId, String cityName, String cityState) {
        this.cityNo = cityId;
        this.cityName = cityName;
        this.cityState = cityState;
    }
    
    public void addToCityList(){
        cityList.add(this);
        
    }

    public int getCityNo() {
        return cityNo;
    }

    public String getCityName() {
        return cityName;
    }

    public String getCityState() {
        return cityState;
    }

    public static ArrayList<City> getCityList() {
        return cityList;
    }

}
