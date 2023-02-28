package ru.progwards.java1.lessons.params;

public class IntInteger extends AbsInteger{
    int  someNum;
    public IntInteger (int  someNum){
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
