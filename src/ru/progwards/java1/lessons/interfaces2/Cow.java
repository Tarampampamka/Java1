package ru.progwards.java1.lessons.interfaces2;

import ru.progwards.java1.lessons.interfaces2.Animal;

import static ru.progwards.java1.lessons.interfaces2.Animal.FoodKind.HAY;
import static ru.progwards.java1.lessons.interfaces2.IColor.Color.RED;

class Cow extends Animal {

    public Cow(String name) {
        super(name);
    }
    public Cow(String name, Double weight) {
        super(name,weight);
    }
    public String getHome(){
        return "ферма";
    }
    @Override
    public String kind(){
       return "корова";
    }
    @Override
    public String say(){
        return "мууууууу";
    }
    @Override
    public FoodKind getFoodKind(){
        return HAY;}
    @Override
    public double getFoodCoeff(){
        return 0.05;
    }

    @Override
    public Color getColor() {
        return RED;
    }
    public static void main(String[] args) {
        Cow g=new Cow("Пони",258.4);
        System.out.println(g.compareWeight(new Cow("Пеструшка",258.4)));

    }
}

