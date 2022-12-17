package ru.progwards.java1.lessons.useclasses;

import ru.progwards.java1.lessons.useclasses.Count;

public class CountTest {
    /*Создать экземпляр класса Count используя конструктор по умолчанию
    В цикле от 0 до count вызывать метод inc,
    печатать значение счетчика используя метод getCount() через пробелы, так, чтобы получился вывод значений в одну строку
    в конце метода с новой строки вывести на консоль "тест inc окончен"*/

    public static void testInc(int count){
        int b =count;
        count = 0;
        while (count<b){
            Count i=new Count(count);
            i.inc();
            System.out.print(i.getCount()+" ");
            count++;
        }
        System.out.print("\nтест inc окончен");
    }
    public static void testDec(int count) {
        Count i = new Count(count);
        int a =0;
        do { if (i.dec()){
                System.out.print(i.getCount() + " ");
                a++;
        }
            else {
                while (a<count){
                    System.out.print(i.getCount() + " ");
                    i.dec();
                    a++;
                    }
                System.out.print("\ncount равен 0");
                break;
            }
            }
            while (a < count);
            System.out.println("\nтест dec окончен");
    }

    public static void main(String[] args){
        testInc(7);
        testInc(0);
        testInc(-1);
        System.out.print("\n");
        testDec(9);
        testDec(0);
        testDec(-5);
    }

}

