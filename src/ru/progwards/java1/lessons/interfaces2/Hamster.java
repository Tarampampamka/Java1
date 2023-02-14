package ru.progwards.java1.lessons.interfaces2;

import ru.progwards.java1.lessons.interfaces2.Animal;

import static ru.progwards.java1.lessons.interfaces2.Animal.FoodKind.CORN;
import static ru.progwards.java1.lessons.interfaces2.IColor.Color.BEIGE;

class Hamster extends Animal {
    public Hamster(String name) {
        super(name);
    }
    public Hamster(String name, Double weight) {
        super(name,weight);
    }
    public String getHome(){
        return "поле";
    }

    @Override
    public String kind(){
        return "хомяк";
    }
    @Override
    public String say(){
        return "хрум-хрум-хрум";
    }
    @Override
    public FoodKind getFoodKind(){
        return CORN;
    }
    @Override
    public double getFoodCoeff(){
        return 0.06;
    }

    public Color getColor() {
        return BEIGE;
    }
}
