package ru.progwards.java1.lessons.basics;

public class ReverseDigits {
    public static int reverseDigits (int number) {
        int a = number % 10;
        int b = number/10 % 10;
        int c = number/100;
        int Res = a*100 + b*10 + c;
        return Res;
    }
    /*public static void main(String[] args) {
        ReverseDigits.reverseDigits(789);
    }*/
}
