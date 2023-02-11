package ru.progwards.java1.lessons.interfaces1;

import static ru.progwards.java1.lessons.interfaces1.Animal.FoodKind.CORN;
import static ru.progwards.java1.lessons.interfaces1.IColor.Color.BEIGE;

class Hamster extends Animal{
    public Hamster(String name) {
        super(name);
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

    public IColor.Color getColor() {
        return BEIGE;
    }
}
