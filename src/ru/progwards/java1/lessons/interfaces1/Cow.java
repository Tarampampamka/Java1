package ru.progwards.java1.lessons.interfaces1;

import ru.progwards.java1.lessons.interfaces1.Animal;

import static ru.progwards.java1.lessons.interfaces1.Animal.FoodKind.HAY;
import static ru.progwards.java1.lessons.interfaces1.IColor.Color.RED;

class Cow extends Animal implements IColor {

    public Cow(String name) {
        super(name);
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
        System.out.println(new Cow("Пеструшка").getColor());
    }
}

