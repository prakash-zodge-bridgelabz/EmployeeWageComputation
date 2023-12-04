package com.bridgelabz;
import java.util.Random;
public class EmployeeWageComputation {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation");
        EmployeeWageComputation e1 = new EmployeeWageComputation();
        e1.UC_1_EmployeeAttendanceUC();
    }
    public void UC_1_EmployeeAttendanceUC(){
        Random random = new Random();
        // Generate a random number between 0 and 1
        int randomNumber = random.nextInt(2);
        // Check if the random number is 0, which means the employee is present
        if (randomNumber == 0) {
            System.out.println("The employee is present.");
        }
        else {
            // Otherwise, the employee is absent
            System.out.println("The employee is absent.");

        }
    }
}
