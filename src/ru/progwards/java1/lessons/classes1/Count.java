package ru.progwards.java1.lessons.classes1;

public class Count {
    int count=0;
    public Count() {
    }
    public Count(int count){
        this.count=count;
    }
    public int getCount(){
        return count;
    }
    public void inc(){

        count=count+1;
    }
    public boolean dec(){
        count--;
        return count == 0;
    }
    public static void main(String[] args) {
        /*Count i = new Count(10);
        for (i.getCount(); i.dec()!=true; )
            continue;
        System.out.println("count равен 0");*/
        Count i=new Count(10);
        if (i.dec() == true)
            System.out.println("count равен 0");

    }
}

