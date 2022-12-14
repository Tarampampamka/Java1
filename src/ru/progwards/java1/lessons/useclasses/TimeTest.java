package ru.progwards.java1.lessons.useclasses;

import ru.progwards.java1.lessons.classes1.ComplexNum;
import ru.progwards.java1.lessons.classes1.Count;
import ru.progwards.java1.lessons.classes1.Time;

public class TimeTest {
    public static void main(String[] args){
        Time time0=new Time(0,0,0);
        System.out.println(time0.toString());

        Time time1=new Time(1,2,3);
        System.out.println(time1.toString());

        Time time2=new Time(11,12,13);
        System.out.println(time2.toString());

        Time test0 = time0;
        System.out.println("в time0 "+test0.toSeconds()+" секунд");

        Time test1 = time1;
        System.out.println("в time1 "+test1.toSeconds()+" секунд");

        Time test2 = time2;
        System.out.println("в time2 "+test2.toSeconds()+" секунд");

        System.out.println("разница между time0 и time1 равна "+time0.secondsBetween(time1));
        System.out.println("разница между time2 и time0 равна "+time0.secondsBetween(time2));
        System.out.println("разница между time1 и time2 равна "+time1.secondsBetween(time2));
    }
}
