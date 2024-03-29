package ru.progwards.java1.lessons.interfaces1;

import static ru.progwards.java1.lessons.interfaces1.Animal.FoodKind.CORN;
import static ru.progwards.java1.lessons.interfaces1.IColor.Color.GRAY;

class Duck extends Animal{
    public Duck(String name) {
        super(name);
    }
    public Duck(String name,Double weight) {
        super(name,weight);
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

    public IColor.Color getColor() {
        return GRAY;
    }
}
