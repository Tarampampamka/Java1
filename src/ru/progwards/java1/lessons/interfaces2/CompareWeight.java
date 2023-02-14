package ru.progwards.java1.lessons.interfaces2;

import java.util.Arrays;

public interface CompareWeight {
    public enum CompareResult{
        LESS,
        EQUAL,
        GREATER
    }
    public CompareResult compareWeight(CompareWeight smthHasWeight);
    public double getWeight();
    public static void sort(CompareWeight[] a){
        CompareWeight b;
        String q;
        for (int i =0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++)
                if (a[i].getWeight() > a[j].getWeight()){
                    b=a[i];
                    a[i] = a[j];
                    a[j]=b;
                }
                else continue;
        }
    };
}
