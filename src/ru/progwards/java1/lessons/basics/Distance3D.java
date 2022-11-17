package ru.progwards.java1.lessons.basics;

public class Distance3D {
    public static double distance(double x1, double y1,double z1, double x2, double y2, double z2){
        double AB = Math.sqrt ((x2*x2-2*x1*x2+x1*x1)+(y2*y2-2*y1*y2+y1*y1)+(z2*z2-2*z1*z2+z1*z1));
        return  AB;
    }
    /*public static void main(String[] args) {
        System.out.println (Distance3D.distance(2,5,7,6,3,4));

    }*/
}
