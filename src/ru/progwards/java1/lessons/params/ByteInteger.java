package ru.progwards.java1.lessons.params;

public class ByteInteger extends AbsInteger{
    byte someNum;
    public ByteInteger (byte someNum){
        this.someNum=someNum;
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
    /*public static void main(String[] args) {
        AbsInteger a=new ByteInteger((byte) 120);
        AbsInteger s=new ShortInteger((short) 32767);
        AbsInteger pl=add(a,s);
        System.out.println(add(new ByteInteger((byte) -100),new ShortInteger((short) -30)).get());
        System.out.println(add(new ByteInteger((byte) 120),new IntInteger( 321)).get());
        System.out.println((add(new ByteInteger((byte) 120),new ShortInteger((short) 568)).get()));
        System.out.println(pl instanceof IntInteger);
        int w = a.get();
        System.out.println(pl);
    }*/
}
