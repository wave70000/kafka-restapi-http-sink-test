package com.example.demo.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter @Setter
    private Long id;

    @Getter @Setter
    private Long EmployeesId;
    @Getter @Setter
    private String Name;
    @Getter @Setter
    private String Location;
    @Getter @Setter
    private String __deleted;

    public Employee() {
    }

    public Employee(Long employeesId, String name, String location, String __deleted) {
        EmployeesId = employeesId;
        Name = name;
        Location = location;
        this.__deleted = __deleted;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "EmployeesId=" + EmployeesId +
                ", Name=" + Name +
                ", Location=" + Location +
                ", __deleted='" + __deleted + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        return id != null ? id.equals(employee.id) : employee.id == null;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
