package ru.progwards.java1.lessons.compare;

public class TriangleSimpleInfo {
    public static int maxSide(int a, int b, int c){
        int f;
        if (a>=b && a>=c)
            f=a;
        else if (b>=c)
            f=b;
        else f=c;
        return f;
    }
    public static int minSide(int a, int b, int c){
        int q;
        if (a<=b && a<=c)
            q=a;
        else if (b<=c)
            q=b;
        else q=c;
        return q;
    }
    public static boolean isEquilateralTriangle(int a, int b, int c){
        boolean i = a==b && a==c && b==c;
        return i;
    }

    /*public static void main(String[] args) {
        System.out.println(isEquilateralTriangle(3, 3, 3));
    }*/
}
