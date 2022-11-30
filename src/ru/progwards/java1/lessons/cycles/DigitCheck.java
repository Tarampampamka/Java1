package ru.progwards.java1.lessons.cycles;
//возвращает true, если число number содержит цифру digit.

public class DigitCheck {
    public static boolean containsDigit(int number, int digit){
        boolean result;
        String string = Integer.toString(number);
        String substring = Integer.toString(digit);
        result=string.contains(substring);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(containsDigit(1168221312,8));
    }
}
