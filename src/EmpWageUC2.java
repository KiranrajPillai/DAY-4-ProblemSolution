package com.bridgelab;
import java.util.Random;
public class EmpWageUC2 {
    public static void EmpStatus(int num) {
        int WagePerHrs = 20;
        int DayHrs = 8;
        if (num == 1) {
            System.out.println("Employee Present");
            System.out.println("DailyWage = " + WagePerHrs * DayHrs);
        } else {
            System.out.println("Employee Absent");
            System.out.println("DailyWage = " + 0);
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        Random randm = new Random();
        int a = randm.nextInt(2);
        EmpStatus(a);
    }

}