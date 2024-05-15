package org.example;

import java.util.Comparator;

public class Employee implements Comparable<Employee>{

    private int age;
    private String name;
    private String gender;
    private String department;

    public Employee(int age, String name, String gender,
            String department) {
        this.age = age;
        this.name = name;
        this.gender = gender;
        this.department = department;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", department='" + department + '\'' +
                '}';
    }

    /*@Override
    public int compare(Employee o1, Employee o2) {
        return o1.age-o2.age;
    }*/

    @Override
    public int compareTo(Employee o) {
        if(this.age>o.age)
            return 1;
        if(this.age<o.age)
            return -1;
        return 0;

    }

}
