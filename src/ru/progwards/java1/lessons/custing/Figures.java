package ru.progwards.java1.lessons.custing;

public class Figures {
    static double Pi = 3.14;
    public static double circle(double r){
        double S_Cir = Pi* (r*r);
        return S_Cir;
    }
    public static double square(double n){
        double S_Sq = n*n;
        return S_Sq;
    }
    public static Double triangle(double k){
        Double P = (k+k+k)/2;
        Double S_Tr = Math.sqrt (P*(P-k)*(P-k)*(P-k));
        return S_Tr;
    }
    public static double squareVsTraiange(double p){
     double S_vs_T = square(p)/triangle(p);
     return S_vs_T;
    }
    public static double squareVsCircle(double p){
        double S_vs_C = square(p)/circle(p);
        return S_vs_C;
    }
    public static double triangleVsCircle(double p){
        double Tr_vs_C = triangle(p)/circle(p);
        return Tr_vs_C;
    }
    /*public static void main(String[] args) {
        System.out.println(circle(5.0));
        System.out.println(square(4.8));
        System.out.println(triangle(8.2));
        System.out.println(squareVsTraiange(56.98796587545567));
        System.out.println(squareVsCircle(56.98796587545567));
        System.out.println(triangleVsCircle(56.98796587545567));
    }*/
}
