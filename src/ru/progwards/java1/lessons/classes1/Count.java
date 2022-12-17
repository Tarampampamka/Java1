package ru.progwards.java1.lessons.classes1;

public class Count {
    int count=0;
    public Count() {
    }
    public Count(int count){
        this.count=count;
    }
    public int getCount() {
        return count;
    }
    public void inc(){

        count++;
    }
    public boolean dec(){
        count--;            //count=count-1;
        boolean isOk;       //return count == 0;
        if (count<=0) isOk =true;
        else isOk=false;
        return isOk;

    }
    public static void main(String[] args) {
        Count i = new Count(10);
        int a = 0;
        do {
            if (i.dec() == false) {
                //System.out.print(i.getCount() + " ");
                a++;
            } else {
                System.out.print("count равен 0");
                break;
            }
        }
            while (a < 10) ;
        }

    }