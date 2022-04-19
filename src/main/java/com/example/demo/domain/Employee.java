package com.example.demo.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long EmployeesId;
    private String Name;
    private String Location;
    private String __deleted;

    public Employee(Long employeesId, String name, String location, String __deleted) {
        EmployeesId = employeesId;
        Name = name;
        Location = location;
        this.__deleted = __deleted;
    }

//    @Override
//    public String toString() {
//        return "Employee{" +
//                "EmployeesId=" + EmployeesId +
//                ", Name=" + Name +
//                ", Location=" + Location +
//                ", __deleted='" + __deleted + '\'' +
//                '}';
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        Employee employee = (Employee) o;
//
//        return id != null ? id.equals(employee.id) : employee.id == null;
//    }
//
//    @Override
//    public int hashCode() {
//        return id != null ? id.hashCode() : 0;
//    }
}
