package ru.progwards.java1.lessons.arrays2;

import java.util.Arrays;

public class DIntArray {
    private int[] a1={2,5,24,78,4,0,1,89,2};
    public DIntArray() {
    }
    //добавляет элемент num в конец массива, при этом размер массива должен увеличиться на 1
    public void add(int num){
        int[] newMas= new int[a1.length+1];
        System.arraycopy(a1,0,newMas,0,a1.length);
        newMas[newMas.length-1]=num;
    }
    //добавляет элемент num в позицию pos массива, при этом размер массива должен увеличиться на 1
    public void atInsert(int pos, int num){
        int[] newMas= new int[a1.length+1];
        System.arraycopy(a1,0,newMas,0,a1.length-(a1.length-(pos-1)));
        newMas[pos-1]=num;
        System.arraycopy(a1,pos-1,newMas,pos,a1.length-(pos-1));
    }
    //удаляет элемент в позиции pos массива, при этом размер массива должен уменьшиться на 1
    public void atDelete(int pos){
        int[] newMas= new int[a1.length-1];
        System.arraycopy(a1,0,newMas,0,a1.length-(a1.length-(pos-1)));
        System.arraycopy(a1,pos,newMas,pos-1,a1.length-pos);
    }
    //возвращает элемент по индексу pos
    public int at(int pos){
        int res=0;
        if (pos>0) {
            for (int i = 0; i <= a1.length-(a1.length-(pos-1)); i++) {
                res = a1[i];
            }
        }
        return res;
    }
    public static void main(String[] args) {
        //System.out.println(at(3));
    }
}
