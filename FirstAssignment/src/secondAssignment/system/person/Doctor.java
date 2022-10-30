/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package secondAssignment.system.person;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author sweta
 */
public class Doctor extends HospitalEmployee {
    
    private static ArrayList<String> Department_List = 
            new ArrayList<String>(Arrays.asList("General","Pediadtric","Internal Medicine"));
    
    private String department;
    
//    public Doctor(String name, String age, String contact, String employeeID) {
//        super(name, age, contact, employeeID);
//        setDepartment(department);
//    }

    public static ArrayList<String> getDepartment_List() {
        return Department_List;
    }

    public static void setDepartment_List(ArrayList<String> Department_List) {
        Doctor.Department_List = Department_List;
        
    }

    public Doctor(String name, Integer patientID, Integer age, String email, City city, House house, Community community) {
        super(name, patientID, age, email, city, house, community);
        setDepartment(department);
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        if(Department_List.contains(department)){
        this.department = department;
        }
        else{
            throw new IllegalArgumentException("worng department");
        }
    }
    
    @Override
     public void setEmployeeID(String employeeID) {
        if(employeeID.endsWith("D") ){
        super.setEmployeeID(employeeID);
        }
        else{
            throw new IllegalArgumentException("worng employee id");
        }
    }
    
}
