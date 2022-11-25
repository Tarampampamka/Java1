package ru.progwards.java1.lessons.compare;

public class TriangleInfo {
    public static boolean isTriangle(int a, int b, int c){
        boolean i = a < b+c && b < a+c && c < a+b;
        return i;
    }
    public static boolean isRightTriangle(int a, int b, int c){
        boolean w = (a < b+c && b < a+c && c < a+b) && ((a*a+b*b)==c*c || (b*b+c*c)==a*a || (a*a+c*c)==b*b);
        return w;
    }
    public static boolean isIsoscelesTriangle(int a, int b, int c){
        boolean m = (a < b+c && b < a+c && c < a+b) && (a==b || a==c || b==c);
        return m;
    }

    /*public static void main(String[] args) {
        System.out.println(isIsoscelesTriangle(3,3,3));
    }*/
}


