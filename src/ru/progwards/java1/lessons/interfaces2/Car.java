package ru.progwards.java1.lessons.interfaces2;

public class Car implements CompareWeight{
    private double weight;
    public Car(double weight){
        this.weight=weight;
    }

    @Override
    public CompareResult compareWeight(CompareWeight smthHasWeight) {
        CompareResult q=null;
        if (this.weight<smthHasWeight.getWeight()){
            q=CompareResult.LESS;
        };
        if (this.weight==smthHasWeight.getWeight()){
            q=CompareResult.EQUAL;
        };
        if (this.weight>smthHasWeight.getWeight()){
            q=CompareResult.GREATER;
        };
        return q;
    }
    @Override
    public double getWeight(){
        return weight;
    }
    public String toString(){
        return "Это автомобиль грузоподъемностью "+weight;
    }
    public static void main(String[] args) {
        Car g=new Car(258.4);
        System.out.println(g.toString());
        System.out.println(g.compareWeight(new Car(28.4)));

    }
}
