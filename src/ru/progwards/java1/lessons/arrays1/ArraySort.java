package ru.progwards.java1.lessons.arrays1;

public class ArraySort {
    public static void sort(int[] a){
        int b;
        for (int i =0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++)
                if (a[i] > a[j]){
                    b=a[i];
                    a[i] = a[j];
                    a[j]=b;
                }
                else continue;
        }
    }
    /*public static void main(String[] args) {
        int[] a = {0,5,2,24,78,4,1,0,89,2};
        sort(a);
    }*/
}
