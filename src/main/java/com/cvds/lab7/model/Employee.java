package com.cvds.lab7.model;
import org.springframework.beans.factory.xml.PluggableSchemaResolver;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long employeeId;
    private String firstName;
    private String lastName;
    private String role;
    private Double salary;

    public Employee (){
    }

    public Employee(String firstName, String lastName, String role, double salary) {
        this.firstName=firstName;
        this.lastName=lastName;
        this.role=role;
        this.salary=salary;
    }


    public Long getEmployeeId() {
        return employeeId;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public String getRole(){
        return role;
    }

    public Double getSalary(){
        return salary;
    }



    public void setLastName(String lastName){
        this.lastName=lastName;
    }

    public void setRole(String role){
        this.role=role;
    }

    public void setSalary(Double salary){
        this.salary=salary;
    }

    public void setFirstName(String firstName) {
        this.firstName=firstName;
    }
    
}
