package com.itacademy.java.oop.basics;

import java.time.LocalDate;

public class Employee {
    private String name;
    private String surname;
    private String contractType;
    private LocalDate startDate;
    private int salary;
    private String position;

    public Employee(String name, String surname, String contractType, LocalDate startDate, int salary, String position){

        this.name = name;
        this.surname = surname;
        this.contractType = contractType;
        this.startDate = startDate;
        this.salary = salary;
        this.position = position;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", contractType='" + contractType + '\'' +
                ", startDate=" + startDate +
                ", salary=" + salary +
                ", position='" + position + '\'' +
                '}';
    }
}
