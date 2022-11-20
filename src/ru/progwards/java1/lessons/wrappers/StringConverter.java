package ru.progwards.java1.lessons.wrappers;

public class StringConverter {
    public static String fromByte(byte number){
        Byte x = number;
        String str = x.toString();
        return str;
    }
    public static String fromShort(short number){
        Short x = number;
        String str = x.toString();
        return str;
    }
    public static String fromInt(int number){
        Integer x = number;
        String str = x.toString();
        return str;
    }
    public static String fromLong(long number){
        Long x = number;
        String str = x.toString();
        return str;
    }
    public static String fromFloat(float number){
        Float x = number;
        String str = x.toString();
        return str;
    }
    public static String fromDouble(double number){
        Double x = number;
        String str = x.toString();
        return str;
    }
    /*public static void main(String[] args) {
        System.out.println(fromByte((byte) 98));
        System.out.println(fromShort((short) 98));
        System.out.println(fromInt( 985));
        System.out.println(fromLong( 985L));
        System.out.println(fromFloat( 100.123F));
        System.out.println(fromDouble( 567.89));
    }*/

}

