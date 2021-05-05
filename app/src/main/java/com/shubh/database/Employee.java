package com.shubh.database;

public class Employee {

    public Employee(Integer sno, String name, double increment) {
        this.sno = sno;
        this.name = name;
        this.increment = increment;
    }

    public Integer getSno() {
        return sno;
    }

    public void setSno(Integer sno) {
        this.sno = sno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getIncrement() {
        return increment;
    }

    public void setIncrement(double increment) {
        this.increment = increment;
    }

    private Integer sno;
    private String name;
    private double increment;

}
