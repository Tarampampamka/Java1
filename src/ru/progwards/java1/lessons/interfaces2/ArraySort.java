package ru.progwards.java1.lessons.interfaces2;

import java.util.Arrays;

// Сортируем элементы массива по возрастанию
public class ArraySort {
    public static void sort(CompareWeight[] a){
        CompareWeight b;
        for (int i =0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++)
                if (a[i].getWeight() > a[j].getWeight()){
                    b=a[i];
                    a[i] = a[j];
                    a[j]=b;
                }
                else continue;
        }
    }
}
