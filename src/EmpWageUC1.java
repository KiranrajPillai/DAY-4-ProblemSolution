package com.bridgelab;
import java.util.Random;
public class EmpWageUC1 {
    public static void EmpStatus(int num){
        if(num==1)
        System.out.println("Employee is Present");
        else
        System.out.println("Employee is Absent");
    }

    public static void main(String[] args) {
        Random randm = new Random();
                int r = randm.nextInt(2);
                EmpStatus(r);

    }
}
