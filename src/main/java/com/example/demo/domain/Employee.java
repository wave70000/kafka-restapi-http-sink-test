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
    private Long __id;
    @Getter @Setter
    private String name;
    @Getter @Setter
    private String location;

    public Employee() {
    }

    public Employee(Long __id, String name, String location) {
        this.__id = __id;
        this.name = name;
        this.location = location;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "__id=" + __id +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (__id != null ? !__id.equals(employee.__id) : employee.__id != null) return false;
        if (name != null ? !name.equals(employee.name) : employee.name != null) return false;
        return location != null ? location.equals(employee.location) : employee.location == null;
    }

    @Override
    public int hashCode() {
        int result = __id != null ? __id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (location != null ? location.hashCode() : 0);
        return result;
    }
}
