package com.bridgelab;
import java.util.Random;
public class EmpwgaeUc3 {
    public static void EmpStatus(int num) {
        int WagePerHrs = 20;
        int DayHrs = 8;
        int PartTimeHrs = 4;
        if (num == 1) {
            System.out.println("Employee Present");
            System.out.println("DailyWage = " + WagePerHrs * DayHrs);
        } else if (num == 2) {
            System.out.println("Employee Present");
            System.out.println("DailyWage Part Time = " + WagePerHrs * (DayHrs + PartTimeHrs));
        } else {
            System.out.println("Employee Absent");
            System.out.println("DailyWage = " + 0);
        }
    }
}