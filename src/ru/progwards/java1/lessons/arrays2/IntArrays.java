package ru.progwards.java1.lessons.arrays2;

import java.util.Arrays;

import static java.util.Arrays.sort;

public class IntArrays {
    //привести к строке массив
    public static String toString(int []a){
        String res="",fin="";
        if (a.length!=0) {
            for (int i = 0; i < a.length - 1; i++) {
                res += Integer.toString(a[i]) + ", ";
            }
            fin = Integer.toString(a[a.length - 1]);
        }
        return res="["+res+fin+"]";
    }
    //массивы содержащие одинаковые элементы были равны, вне зависимости от их порядка.
    public static boolean equals1(int[] a1, int[] a2){
        boolean ok=false;
        int temp1,temp2;
        if (a1.length==a2.length){
            for (int i = 0; i < a1.length - 1; i++) {
                for(int j=i+1;j<a1.length;j++)
                    if (a1[i] > a1[j]){
                        temp1=a1[i];
                        a1[i] = a1[j];
                        a1[j]=temp1;
                    }
                    else continue;
            }
            for (int i = 0; i < a2.length - 1; i++) {
                for(int j=i+1;j<a2.length;j++)
                    if (a2[i] > a2[j]){
                        temp2=a2[i];
                        a2[i] = a2[j];
                        a2[j]=temp2;
                    }
                    else continue;
            }
            String firstMas=toString(a1);
            String secondMas=toString(a2);
            ok=firstMas.equals(secondMas);
        }
        return ok;
    }
    //аналогично equals1 используя методы класса Arrays
    public static boolean equals2(int[] a1, int[] a2){
        Arrays.sort(a1);
        Arrays.sort(a2);
        return Arrays.equals(a1,a2);
    }
    public static void main(String[] args) {
        int[] a1 = {4,51,24,78,11,89,2,2,0};
        int[] a2 = {4,51,24,78,2,0,11,89,2};
        System.out.println(equals1(a1,a2));
    }
}
