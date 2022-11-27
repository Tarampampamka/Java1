package ru.progwards.java1.lessons.compare;

public class Divisibility {
    public static void check(int num1, int num2) {
        String strOut = "";
        if (num2 == 0)
            strOut = "На ноль делить нельзя";
        else if (num1 % num2 == 0)
            strOut = num1 + " делится нацело на " + num2;
        else strOut = "Остаток от деления " + num1 + " на " + num2 + " равен " + num1 % num2;
        System.out.println(strOut);
        if (num2 != 0) {
            double ch = (double) num1 / (double) num2;
            System.out.println("Частное от деления " + num1 + " на " + num2 + " равно " + ch);
        }
    }

    public static void main(String[] args) {
        check(13,2);
    }
}
