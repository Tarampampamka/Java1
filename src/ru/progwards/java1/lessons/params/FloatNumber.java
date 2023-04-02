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
    FloatNumber(String num) {
        char[] result = num.toCharArray();
        String tempStr1 = "", tempStr2 = "", tempStr3 = "";
        if (result[0] == '-') {
            this.sign = false;
        } else this.sign = true;

        int j = 0, point = 0, tail = 0;
        if ((result[0] == '-') || (result[0] == '+')) {
            for (int i = 1; i < result.length; i++) {
                if ((result[i] != 'E') & (result[i] != 'Е') & (result[i] != 'e')) {
                    if (result[i] == '.') {
                        point = i;
                        continue;
                    } else {
                        tempStr1 += result[i];
                        if (point != 0) {
                            tail = i - point;
                        }
                    }
                } else {
                    j = i;
                    break;
                }
            }
            if (j != 0) {
                for (int k = j + 1; k < result.length; k++)
                    tempStr3 += result[k];
            }

            this.mantissa = Long.parseLong(tempStr1);
            if (tail > 0) {
                tempStr2 = String.valueOf(tail);
            } else tempStr2 = "0";
            this.exp = Integer.parseInt(tempStr2);
            if (j != 0) {
                this.exp = exp + Integer.parseInt(tempStr3);
            }
        } else {
            for (int i = 0; i < result.length; i++) {
                if ((result[i] != 'E') & (result[i] != 'Е') & (result[i] != 'e')) {
                    if (result[i] == '.') {
                        point = i;
                        continue;
                    } else {
                        tempStr1 += result[i];
                        if (point!=0) {
                            tail = i - point;
                        }
                    }
                } else {
                    j = i;
                    break;
                }
            }
            if (j != 0) {
                for (int k = j + 1; k < result.length; k++)
                    tempStr3 += result[k];
            }

            this.mantissa = Long.parseLong(tempStr1);

            if (tail > 0) {
                tempStr2 = String.valueOf(tail);
            } else tempStr2 = "0";

            this.exp = Integer.parseInt(tempStr2);
            if (j != 0) {
                this.exp = exp + Integer.parseInt(tempStr3);
            }
        }
    }
    @Override
    public String toString(){
        String first="",fin;
        int exp2=0;
        String q=String.valueOf(mantissa), rest=q.substring(1);
        char second = q.charAt(0);
        if (!sign) first="-";
        if (exp > rest.length()) {
            exp2 = exp-rest.length();
        }
        if (exp <= rest.length()){
            exp2 = rest.length()-exp;
        }
        char y;
        for (int i = rest.length()-1; i >= 1; i--){
            if (rest.charAt(i)=='0') {
                rest=rest.replaceAll(".$", "");
            }
            else break;
        }
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
        String vr = String.valueOf(num);
        new FloatNumber(vr);
    }
    void negative(){
        if (!sign){
            sign=true;
        }
        else sign=false;
    }
    FloatNumber add(FloatNumber num){
        double a =toDouble()+num.toDouble();
        String temp = String.format("%.3f",a);
        String result = temp.replace(',','.');
        return new FloatNumber(result);
    }
    FloatNumber sub(FloatNumber num){
        num.negative();
        return add(num);
    }
    public static void main(String[] args) {
        FloatNumber t = new FloatNumber("2.9458817835E8");
        FloatNumber q = new FloatNumber(true, 131855750, 3);
        q.negative();
        t.fromDouble(2.9458817835E8);
        FloatNumber o = new FloatNumber(true, 352450, 3);
        System.out.println(o.toDouble());
        System.out.println(q.toString());
        System.out.println(t.toString());
        FloatNumber a =new FloatNumber(true, 58038, 2);
        FloatNumber e = a.add(new FloatNumber(true, 757913, 3));
        System.out.println(e.toString());
        FloatNumber p = new FloatNumber(true, 14367, 3);
        FloatNumber j = p.sub(new FloatNumber(true, 122776, 3));
        System.out.println(j);
    }
}








