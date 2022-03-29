package com.itacademy.java.oop.basics;

import java.time.LocalDate;

public class EmployeeManager {
    public static void main(String[] args) {
        Employee employee = new Employee("Name","Surname","Full-Time", LocalDate.of(2020, 1, 8), 2000, "Manager");

        System.out.println(employee.toString());
    }
}
