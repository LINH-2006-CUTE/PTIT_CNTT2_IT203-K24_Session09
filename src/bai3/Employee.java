package bai3;

import java.util.Scanner;

class Employee {
    protected String name;
    protected double baseSalary;
    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }
    public void display() {
        System.out.println("Tên nhân viên: " + name);
        System.out.println("Lương cơ bản: " + baseSalary);
    }
}