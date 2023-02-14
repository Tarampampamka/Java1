package ru.progwards.java1.lessons.interfaces2;

import ru.progwards.java1.lessons.interfaces2.Animal;

import static ru.progwards.java1.lessons.interfaces2.Animal.FoodKind.CORN;
import static ru.progwards.java1.lessons.interfaces2.IColor.Color.GRAY;

class Duck extends Animal {
    public Duck(String name) {
        super(name);
    }
    public Duck(String name, Double weight) {
        super(name,weight);
    }
    public String getHome(){
        return "ферма";
    }

    @Override
    public String kind(){
        return "утка";
    }
    @Override
    public String say(){
        return "кря-кря";
    }
    @Override
    public FoodKind getFoodKind(){
        return CORN;
    }
    @Override
    public double getFoodCoeff(){
        return 0.04;
    }

    public Color getColor() {
        return GRAY;
    }
}
