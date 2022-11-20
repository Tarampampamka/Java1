package ru.progwards.java1.lessons.wrappers;

public class NumMetrics {
    public static Integer sumDigits(Integer number){
        Integer a = number % 10;
        Integer b = number/10 % 10;
        Integer c = number/100;
        Integer d = a+b+c;
        return d;
    }
    public static Integer mulDigits(Integer number){
        Integer a = number % 10;
        Integer b = number/10 % 10;
        Integer c = number/100;
        Integer d = a*b*c;
        return d;
    }

    /*public static void main(String[] args) {
        System.out.println(sumDigits(458));
        System.out.println(mulDigits(123));
    }*/
}
