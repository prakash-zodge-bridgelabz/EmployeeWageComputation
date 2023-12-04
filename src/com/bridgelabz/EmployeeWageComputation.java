package com.bridgelabz;
import java.util.Random;
public class EmployeeWageComputation {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation");
        EmployeeWageComputation e1 = new EmployeeWageComputation();
        e1.UC_1_EmployeeAttendanceUC();
        e1.UC_2_CalculateDailyWageUC();
        e1.UC_3_CalculatePartTimeAndFullTimeWageUC();
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
}
