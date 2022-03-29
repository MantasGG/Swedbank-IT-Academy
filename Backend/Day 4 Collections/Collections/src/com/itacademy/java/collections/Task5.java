package com.itacademy.java.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task5 {
    public static void main(String[] args) {
        Student a = new Student(1, "Jonas", 25, 4);
        Student b = new Student(2, "Petras", 24, 3);
        Student c = new Student(3, "Rokas", 28, 3);
        Student d = new Student(4, "Mantas", 21, 3);

        List<Student> students = new ArrayList<>();
        students.add(a);
        students.add(b);
        students.add(c);
        students.add(d);

        Map<Integer, Student> map = new HashMap<>();

        for (Student student : students) {
            map.put(student.getId(), student);
        }
        map.get(4).setGrade(10);
        map.get(4).setAge(30);
//        map.get(4).setGrade(10);
//        map.get(4).setAge(18);

        for (Map.Entry<Integer, Student> studentai : map.entrySet()) {
            System.out.println(studentai.getKey() + " " + studentai.getValue());
        }
    }
}
