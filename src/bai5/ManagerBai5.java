package bai5;

import static java.lang.Character.getName;

class Manager extends EmployeeBai5 {
    private String department;

    public Manager(String name, double baseSalary, String department) {
        super(name, baseSalary);
        this.department = department;
    }

    @Override
    public void display() {
        System.out.println("Tên: " + getName());
        System.out.println("Lương: " + getBaseSalary());
        System.out.println("Phòng: " + department);
    }
}