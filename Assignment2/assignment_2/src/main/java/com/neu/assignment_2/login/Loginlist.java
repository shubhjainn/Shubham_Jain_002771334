/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.neu.assignment_2.login;

import java.util.ArrayList;

/**
 *
 * @author shubhamjain
 */
public class Loginlist {
    private ArrayList<Credentials> loginList;

    public Loginlist(ArrayList<Credentials> loginList) {
       loginList = new ArrayList<>();
     }

    public ArrayList<Credentials> getLoginList() {
        return loginList;
    }

    public void setLoginList(ArrayList<Credentials> loginList) {
        this.loginList = loginList;
    }
    
    public Credentials addLogin(){
        Credentials login = new Credentials();
        loginList.add(login);
        return login;
    }
}
