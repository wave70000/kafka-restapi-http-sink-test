package com.example.demo.pojo;

public class EmployeePOJO {

    public Long EmployeesId;
    public Long __ts_ms;
    public String Name;
    public String Location;
    public String __deleted;

    public EmployeePOJO(Long employeesId, Long __ts_ms, String name, String location, String __deleted) {
        EmployeesId = employeesId;
        this.__ts_ms = __ts_ms;
        Name = name;
        Location = location;
        this.__deleted = __deleted;
    }
}
