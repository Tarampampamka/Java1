package ru.progwards.java1.lessons.arrays2;

import java.util.Arrays;

public class DIntArray {
    private int[] a1={};
    public DIntArray() {
    }
    //добавляет элемент num в конец массива, при этом размер массива должен увеличиться на 1
    public void add(int num){
        int[] newMas= new int[a1.length+1];
        System.arraycopy(a1,0,newMas,0,a1.length);
        newMas[newMas.length-1]=num;
        a1=newMas;
    }
    //добавляет элемент num в позицию pos массива, при этом размер массива должен увеличиться на 1
    public void atInsert(int pos, int num){
        int[] newMas= new int[a1.length+1];
        System.arraycopy(a1,0,newMas,0,a1.length-(a1.length-pos));
        newMas[pos]=num;
        System.arraycopy(a1,pos,newMas,pos+1,a1.length-pos);
        a1=newMas;
    }
    //удаляет элемент в позиции pos массива, при этом размер массива должен уменьшиться на 1
    public void atDelete(int pos){
        int[] newMas= new int[a1.length-1];
        System.arraycopy(a1,0,newMas,0,a1.length-(a1.length-pos));
        System.arraycopy(a1,pos+1,newMas,pos,a1.length-(pos+1));
        a1=newMas;
    }
    //возвращает элемент по индексу pos
    public int at(int pos){
        int res=-2147483648;
        for (int i = 0; i <= pos; i++) {
                res = a1[i];
            }
            return res;
        }
    public static void main(String[] args) {
        DIntArray q=new DIntArray();
        q.add(17);//17,30,-15,67,78,63,-51,-80,59,91
        q.add(30);
        q.add(-15);
        q.add(67);
        q.add(78);
        q.add(63);
        q.add(-51);
        q.add(-80);
        q.add(59);
        q.add(91);
        System.out.println(q.at(5));
        q.atInsert(0,54);
        System.out.println(q.at(9));
        //q.atDelete(0);
        //System.out.println(q.at(0));
    }
}
