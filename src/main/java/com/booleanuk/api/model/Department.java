package com.booleanuk.api.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table( name = "departments")
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column( name = "location")
    private String location;

    @OneToMany(mappedBy = "department")
    private List<Employee> employees;

    public Department(){
        super();
    }

    public Department(String name, String location) {
        super();
        this.name = name;
        this.location = location;

    }


    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return this.location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}
