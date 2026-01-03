package Practise_Questions.Day1_OOPs;
/*
Q4. Polymorphism in Java

- Compile-time: method overloading
- Runtime: method overriding
*/

class Employee {
    double calculateSalary() {
        return 30000;
    }
}

class FullTimeEmployee extends Employee {
    @Override
    double calculateSalary() {
        return 50000;
    }
}

public class Q4_Polymorphism {
    public static void main(String[] args) {
        Employee emp = new FullTimeEmployee();
        System.out.println(emp.calculateSalary());
    }
}
