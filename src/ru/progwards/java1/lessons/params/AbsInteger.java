package ru.progwards.java1.lessons.params;

public class AbsInteger {
    private int someNum;
    public AbsInteger() {
    }
    AbsInteger (int someNum){
        this.someNum=someNum;
    }
    public int get() {
        return someNum;
    }
    public String toString(){
        String q=String.valueOf(someNum);
        return q;
    }
    static AbsInteger add(AbsInteger num1, AbsInteger num2){
        AbsInteger res = new AbsInteger(num1.get() + num2.get());
        if ((res.get()<=127)&&(res.get()>=-128)){
            ByteInteger res1 = new ByteInteger((byte) res.get());
            res=res1;
        }
        if (((res.get()>127)&&(res.get()<=32767))||((res.get()>=-32768)&&(res.get()<-128))){
            ShortInteger res2 = new ShortInteger((short) res.get());
            res=res2;
        }
        if (((res.get()>32767)&&(res.get()<=2147483647))||((res.get()>=-2147483648)&&(res.get()<-32768))){
            IntInteger res3 = new IntInteger(res.get());
            res=res3;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(add(new ByteInteger((byte) -7), new ByteInteger((byte) -7)));
    }
}
