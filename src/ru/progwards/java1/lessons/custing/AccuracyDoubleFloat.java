package ru.progwards.java1.lessons.custing;

public class AccuracyDoubleFloat {
    public static double calculateAccuracy(){
        double d;
        d=1.0/3.0;
        float f;
        f=(float) d;
        return d = d-f;
    }

    /*public static void main(String[] args) {
        System.out.println(calculateAccuracy());
    }*/
}
