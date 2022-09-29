/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author shubhamjain
 */
public class AddEmployee {
    private ArrayList<Employee> employee_list;
    public AddEmployee(){
        this.employee_list= new ArrayList<Employee>();
    }

    public ArrayList<Employee> getEmployee_list() {
        return employee_list;
    }

    public void setEmployee_list(ArrayList<Employee> employee_list) {
        this.employee_list = employee_list;
    }
    
   public Employee addNewEmployee(){
       Employee newEmployee = new Employee();
       employee_list.add(newEmployee);
       return newEmployee;
   }
   
   public Employee deleteEmployee(boolean emp){
       Employee newEmployee = new Employee();
       employee_list.remove(newEmployee);
       return newEmployee;
   }
    
}
