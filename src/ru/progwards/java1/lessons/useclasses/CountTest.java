package ru.progwards.java1.lessons.useclasses;

import ru.progwards.java1.lessons.classes1.Count;

public class CountTest {
    public static void testInc(int count){
        Count i=new Count(count);
        for (int a =0; a<=count;a++){
            i.inc();
        System.out.print(i.getCount()+" ");
        }
        System.out.println("\nтест inc окончен");
    }
    public static void testDec(int count){
        Count i=new Count(count);
        for (int a =0; a<=count;a++){
            if (i.dec()!=true)
                System.out.print(i.getCount() + " ");
            else {
                System.out.println("\ncount равен 0");
                break;
            }
        }
        System.out.println("тест dec окончен");
    }
    public static void main(String[] args){
        testInc(7);
        testInc(0);
        testInc(-1);
        testDec(9);
        testDec(0);
        testDec(-5);
    }

}
