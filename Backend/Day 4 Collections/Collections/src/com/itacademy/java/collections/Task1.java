package com.itacademy.java.collections;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {

        Student student1 = new Student(1,"Simas",22,3);
        Student student2 = new Student(2,"Tomas",25,3);
        Student student3 = new Student(3,"Rapolas",27,3);
        Student student4 = new Student(4,"Rokas",21,3);
        Student student5 = new Student(5,"Mantas",21,3);

        List<Student> students = new ArrayList<>();

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);


        /*for (Student student: students) {
            if(student.getAge()>25){
                students.remove(student);
            }
        }*/

        for (Student student: students) {
            System.out.println(student.toString());
        }

        /*int[] intArray = {10,20,30,40};
        List<Integer> array = new ArrayList<>();

        for (int element:intArray) {
            array.add(element);
        }

        for (Integer element:array) {
            System.out.println(element.intValue());
        }
*/
        //List<intArray> array = new ArrayList<>();



        /*Student student1 = new Student("Simas",22,3);
        Student student2 = new Student("Tomas",22,3);
        Student student3 = new Student("Rapolas",22,3);
        List<Student> students = new ArrayList<>();

        students.add(student1);
        students.add(student2);
        students.add(student3);

        for (Student student:students) {
            System.out.println(student.getName());
        }*/



        //        ArrayList<String> names = new ArrayList<>();
//
//        names.add("Jomile");
//        names.add("Tomas");
//        names.add("Raminta");
//
//        for (String name : names) {
//            System.out.print(name + " ");
//        }
//
//        names.remove(0);
//
//        System.out.println("--------");
//
//        for (String name : names) {
//            System.out.print(name + " ");
//        }
    }
}
