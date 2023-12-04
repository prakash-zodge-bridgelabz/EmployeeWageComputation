package com.bridgelabz;
import java.util.Random;
import java.util.Scanner;
public class EmployeeWageComputation {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation");
        EmployeeWageComputation e1 = new EmployeeWageComputation();
        e1.UC_1_EmployeeAttendanceUC();
        e1.UC_2_CalculateDailyWageUC();
        e1.UC_3_CalculatePartTimeAndFullTimeWageUC();
        e1.UC_4_EmployeeWageSwitchUC();
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
    public void UC_2_CalculateDailyWageUC(){
        int wagePerHour = 20;
        int fullDayHours = 8;
        int dailyWage = wagePerHour * fullDayHours;
        System.out.println("Daily Employee Wage: Rs." + dailyWage);
    }
    public void UC_3_CalculatePartTimeAndFullTimeWageUC(){
        int partTimeHours = 4;
        int wagePerHour = 20;
        int fullDayHours = partTimeHours*2;
        // Calculate daily employee wage
        int dailyWageFullTime = wagePerHour * fullDayHours;
        System.out.println("Daily Wage for Full-Time Employee: Rs." + dailyWageFullTime);
        // Calculate daily part-time employee wage
        int dailyWagePartTime = wagePerHour * partTimeHours;
        System.out.println("Daily Wage for Part-Time Employee: Rs." + dailyWagePartTime);
    }
    public void UC_4_EmployeeWageSwitchUC(){
        int wagePerHour = 20;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the type of employee (1 for Full-Time, 2 for Part-Time): ");
        int employeeType = scanner.nextInt();
        int dailyWage;
        switch (employeeType) {
            case 1:
                dailyWage = wagePerHour * 8; // Full-Time employee works 8 hours
                System.out.println("Daily Wage for Full-Time Employee: Rs." + dailyWage);
                break;

            case 2:
                dailyWage = wagePerHour * 4; // Part-Time employee works 4 hours
                System.out.println("Daily Wage for Part-Time Employee: Rs." + dailyWage);
                break;

            default:
                System.out.println("Invalid employee type entered.");
        }
    }
}
