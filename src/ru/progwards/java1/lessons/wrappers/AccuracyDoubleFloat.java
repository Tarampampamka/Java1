package ru.progwards.java1.lessons.wrappers;

public class AccuracyDoubleFloat {
    static Double D_Pi = 3.14;
    static Float F_Pi = 3.14F;
    public static Double volumeBallDouble(Double radius){
        Double Vol_Boll_D = 4 * D_Pi * (radius*radius*radius)/3;
        return Vol_Boll_D;
    }
    public static Float volumeBallFloat(Float radius){
        Float Vol_Boll_F = 4 * F_Pi * (radius*radius*radius)/3;
        return Vol_Boll_F;
    }
    public static Double calculateAccuracy(Double radius){
        Float R_From_Dob_to_F = radius.floatValue();
        Double Diff = AccuracyDoubleFloat.volumeBallDouble(radius) - AccuracyDoubleFloat.volumeBallFloat (R_From_Dob_to_F);
        return Diff;
    }
    /*public static void main(String[] args) {
        System.out.println(AccuracyDoubleFloat.volumeBallDouble(1.0));
        System.out.println(AccuracyDoubleFloat.volumeBallFloat(1F));
        System.out.println(AccuracyDoubleFloat.calculateAccuracy(1.0));
    }*/
}
