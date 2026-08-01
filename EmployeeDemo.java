package practice;

import java.util.Scanner;

class Staff {
   
    int empId;
    String empName;
    double salary;


    Staff(int empId, String empName, double salary) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
    }

   
    void displayEmployee() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Salary: " + salary);
        System.out.println();
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

     
        System.out.println("Enter details of Employee 1:");
        System.out.print("Employee ID: ");
        int id1 = sc.nextInt();
        sc.nextLine();
        System.out.print("Employee Name: ");
        String name1 = sc.nextLine();
        System.out.print("Salary: ");
        double salary1 = sc.nextDouble();

      
        System.out.println("\nEnter details of Employee 2:");
        System.out.print("Employee ID: ");
        int id2 = sc.nextInt();
        sc.nextLine();
        System.out.print("Employee Name: ");
        String name2 = sc.nextLine();
        System.out.print("Salary: ");
        double salary2 = sc.nextDouble();

   
        Staff emp1 = new Staff(id1, name1, salary1);
        Staff emp2 = new Staff(id2, name2, salary2);

     
        System.out.println("\nEmployee Details:");
        emp1.displayEmployee();
        emp2.displayEmployee();

        sc.close();
    }
}
