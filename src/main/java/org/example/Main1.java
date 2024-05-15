package org.example;

import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;

public class Main1 {
    public static void main(String[] args) {
        /*Set<Employee> employee=new TreeSet<>();
        employee.add(new Employee(33,"Sam","Male","HR"));
        employee.add(new Employee(22,"aSam1","Male","HR"));
        employee.add(new Employee(55,"xSam2","Female","IT"));
        employee.add(new Employee(44,"bSam3","Female","IT"));
        System.out.println(employee);*/


        //print all department
        /*List<String> ans= employee.stream().map(Employee::getDepartment).distinct().collect(
                Collectors.toList());
        ans.forEach(System.out::println);*/

       /* Map<String,Long> ans= employee.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
        System.out.println(ans);*/
        /*Map<String, Double> ans= employee.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingInt(Employee::getAge)));
        System.out.println(ans);
        Integer aqns=employee.stream().map(Employee::getAge).reduce((x,y)->x>y?x:y).get();
        System.out.println(aqns);*/
        System.out.println("From Thread Main class");
        String lk1="lock1";
        String lk2="lock2";
        Thread t1=new Thread(()->{
            synchronized(lk1){
                try{Thread.sleep(1);} catch(InterruptedException e){e.printStackTrace();}
                synchronized(lk2){
                    System.out.println("Lock Acquired1");
                }
            }
        },"t1");
        Thread t2=new Thread(()->{
            synchronized(lk1){
                try{Thread.sleep(1);} catch(InterruptedException e){e.printStackTrace();}
                synchronized(lk2){
                    System.out.println("Lock acquired2");
                }
            }
        },"t2");
        t1.start();
        t2.start();
    }
}