package ru.progwards.java1.lessons.interfaces1;

import java.util.Arrays;

public class TestCompare {
    public static void main(String[] args) {
        Animal[] animals = new Animal[6];
        Cow cowPestr = new Cow("Пеструшка", 350.0);
        animals[0] = cowPestr;
        Cow cowRyzhaya = new Cow("Рыжая", 250.0);
        animals[1] = cowRyzhaya;
        Duck duckDasha = new Duck("Даша", 3.0);
        animals[2] = duckDasha;
        Duck duckMasha = new Duck("Маша", 3.5);
        animals[3]=duckMasha;
        Hamster hamAka=new Hamster("Акакий", 0.25);
        animals[4]=hamAka;
        Hamster hamPoli=new Hamster("Поликарп", 0.32);
        animals[5]=hamPoli;
        Arrays.sort(animals);
        System.out.println(Arrays.toString(animals));
    }
}
