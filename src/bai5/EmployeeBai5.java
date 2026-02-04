package bai5;

public abstract class EmployeeBai5 {
    public static void main(String[] args) {
        class Employee {
            private String name;
            private double baseSalary;

            public Employee(String name, double baseSalary) {
                this.name = name;
                this.baseSalary = baseSalary;
            }
            public String getName() {
                return name;
            }

            public double getBaseSalary() {
                return baseSalary;
            }

            public double calculateSalary() {
                return baseSalary;
            }
        }
    }

    public abstract void display();
}