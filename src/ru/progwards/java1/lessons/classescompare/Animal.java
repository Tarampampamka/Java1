package ru.progwards.java1.lessons.classescompare;

import static ru.progwards.java1.lessons.classescompare.Animal.FoodKind.CORN;
import static ru.progwards.java1.lessons.classescompare.Animal.FoodKind.HAY;

public abstract class Animal {
    String name;
    Double weight;
    double foodPrice, foodWaight;
    public Animal(String name){
        this.name=name;
    }
    public abstract String kind();
    public abstract String say();
    @Override
    public String toString(){
        return "Это "+kind()+" "+name;
    }
    public void setWeight(double weight){
        this.weight = weight;
        //setWeight(weight);
    }
    public double getWeight(){
        return weight;
    }
    // сравнивает животных по весу
    int compareTo(Animal animal){
        return Double.compare(weight, animal.weight);
    }
    //сравнивает животных по следующим параметрам:имя,тип,вес
    public boolean equals(Object o){
        Animal q = (Animal) o;
        return (q.name.equals(name)) && (q.weight.equals(weight)) && (q.kind().equals(kind()));
    }
    enum FoodKind    {
        HAY,
        CORN
    }

    abstract public FoodKind getFoodKind();

    //возвращает коэффициент веса еды к весу тела животного
    abstract public double getFoodCoeff();

    //рассчитывает необходимый вес еды, по формуле - вес-еды = вес-животного * коэффициент веса тела.
    public double calculateFoodWeight(){
        return foodWaight=weight*getFoodCoeff();
    }
    public double calculateFoodPrice() {
        double d;
        if (getFoodKind() == CORN)
            d = 15;
        else d = 2;
        return foodPrice = calculateFoodWeight() * d;
    }
    public static void main(String[] args){
        Cow C1 = new Cow("Пеструшка");
        Cow C2 = new Cow("Рыжая");
        Cow C3 = new Cow("Рыжая");
        Hamster C4 = new Hamster("Пеструшка");
        //System.out.println(C1);
        C1.weight = 23.5;
        C2.weight = 28.23;
        C3.weight = 28.23;
        C4.weight = 23.5;
        //System.out.println(C4.foodKind);
        System.out.println(C1.calculateFoodPrice());

    }
}
class Cow extends Animal{

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
}

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
}
class Duck extends Animal{
    public Duck(String name) {
        super(name);
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
}
