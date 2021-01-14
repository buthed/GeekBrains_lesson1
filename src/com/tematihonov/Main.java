package com.tematihonov;

public class Main {

    public static void main(String[] args) {
        //task2
        byte newbyte = 100;
        short newshort = 1500;
        int newint = 15;
        long newlong = 20000;
        float newfloat = 12.34f;
        double newdouble = -12.34;
        char newchar = '&';
        boolean newboolean = true;

        System.out.println("Task results:");
        System.out.println("Task 3: " + task3(4.5f,3,5, 2.2f));
        System.out.println("Task 4: " + task4(6,15));
        System.out.println("Task 5: " + task5(-2));
        System.out.println("Task 6: " + task6(2));
        System.out.println("Task 7: " + task7("Владислав"));
        System.out.println("Task 8: " + task8(1900));
    }
    public static float task3(float a, float b, float c, float d) {
        float result;
        result = (a * (b + (c / d)));
        return result;
    }

    public static boolean task4(int a, int b) {
        if (10 <= a+b && a+b <= 20) {
            return true;
        } else {
            return false;
        }
    }

    public static String task5(int a) {
        if (a<0) {
            return "Число отрицательное";
        } else {
            return "Число положительное";
        }
    }

    public static boolean task6(int a) {
        if (a<0) {
            return true;
        } else {
            return false;
        }
    }

    public static String task7(String a) {
        return "Привет, " + a;
    }

    public static String task8(int a) {
        if (a%400 == 0) {
            return  a+" год являетя високосным";
        } else if (a%100 == 0) {
            return  a+" год не являетя високосным";
        } else if (a%4 == 0) {
            return  a+" год являетя високосным";
        } else {
            return  a+" год не являетя високосным";
        }
    }


}

