package ru.progwards.java1.lessons.params;

public class ShortInteger extends AbsInteger{
    short  someNum;
    public ShortInteger (short  someNum){
        this.someNum = someNum;
    };
    @Override
    public String toString(){
        String q=String.valueOf(someNum);
        return q;
    }
    @Override
    public int get() {
        return someNum;
    }
}
