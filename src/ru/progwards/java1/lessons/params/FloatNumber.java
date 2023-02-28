package ru.progwards.java1.lessons.params;

public class FloatNumber {
    boolean sign;
    long mantissa;
    int exp;
    FloatNumber(boolean sing, long mantissa, int exp){
        this.sign=sing;
        this.mantissa=mantissa;
        this.exp=exp;
    }
    FloatNumber(String num){
        char[] result = num.toCharArray();
        String tempStr1 = "",tempStr2 = "0";
    if (result[0]== '-'){
        this.sign=false;
    }
    else this.sign=true;

    int j=0,point=0,tail=0;
    if ((result[0]== '-')||(result[0]== '+')) {
        for (int i = 1; i < result.length; i++) {
            if ((result[i] != 'E') & (result[i] != 'Е') & (result[i] != 'e')) {
                if (result[i] == '.') {
                    point = i;
                    continue;
                } else {
                    tempStr1 += result[i];
                    tail = i - point;
                }
            } else {
                j = i + 1;
                break;
            }
        }
        this.mantissa = Long.parseLong(tempStr1);
        if (j < result.length) {
            for (; j < result.length; j++) {
                tempStr2 += result[j];
            }
        }
        this.exp = Integer.parseInt(tempStr2);  //exp=Integer.valueOf(tempStr2);

        if (point != 0) {
            exp = exp - tail;
        }
    }
    else {
        for (int i = 1; (i < result.length); i++) {
            if ((result[i] != 'E') & (result[i] != 'Е')& (result[i] != 'e')) {
                if (result[i] == '.') {
                    point = i;
                    continue;
                } else {
                    tempStr1 += result[i];
                    j = i + 2;
                    tail = i - point;
                }
            }
        }
        this.mantissa = Long.parseLong(tempStr1);
        if (j < result.length) {
            for (; j < result.length; j++) {
                tempStr2 += result[j];
            }
        }
        this.exp = Integer.parseInt(tempStr2);  //exp=Integer.valueOf(tempStr2);

        if (point != 0) {
            exp = exp - tail;
        }
    }
    }
    public String toString(){
        String first="",fin;
        int exp2=0;
        String q=String.valueOf(mantissa), rest=q.substring(1);
        char second = q.charAt(0);
        if (!sign) first="-";
        exp2=exp+rest.length();
        if (exp2!=0){
            fin= first+second+"."+rest+"E"+exp2;
        }
        else fin= first+second+"."+rest;
        return fin;
    }
    double toDouble(){
        double d;
        return d = Double.parseDouble(toString());
    }
    void fromDouble(double num){
        String str= String.valueOf(num);
    }
    void negative(){
        if (!sign){
            sign=true;
        }
        else sign=false;
        mantissa=-mantissa;
        exp=-exp;
    }
    FloatNumber add(FloatNumber num){
        double a =toDouble()+num.toDouble();
        System.out.println(a);
        String str= String.valueOf(a);
        return new FloatNumber(str);
    }
    FloatNumber sub(FloatNumber num){
        num.negative();
        double a =toDouble()+num.toDouble();
        System.out.println(a);
        String str= String.valueOf(a);
        return new FloatNumber(str);
    }
    public static void main(String[] args) {
        FloatNumber q= new FloatNumber("-253.2Е4");
        System.out.println(q.exp);
        System.out.println(q.mantissa);
        System.out.println(q.toString());
        System.out.println(q.toDouble());
        //q.fromDouble(q.toDouble());
        FloatNumber t = new FloatNumber("+3.7E4");
        System.out.println(t.toDouble());
        System.out.println(q.add(t));
        //System.out.println(q.add(new FloatNumber("+3.7E4")));
        //System.out.println(q.sub(new FloatNumber("+3.7E4")));
    }
}






        /*boolean sumSign=true;
        long sumMantissa=mantissa + num.mantissa;
        if (!sign&!num.sign){
            sumSign = false;
        }
        if (!sign&num.sign){
            if(Math.abs(mantissa)>(Math.abs(num.mantissa))){
                sumSign=false;
            sumMantissa=mantissa-num.mantissa;}
            else {sumMantissa=num.mantissa-mantissa;}
        }if (sign&!num.sign){
            if(Math.abs(mantissa)<(Math.abs(num.mantissa))){
                sumSign=false;
                sumMantissa=num.mantissa-mantissa;}
            else {sumMantissa=mantissa-num.mantissa;}
        }
        int sumExp=exp + num.exp;*/

