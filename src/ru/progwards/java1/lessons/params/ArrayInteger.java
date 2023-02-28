package ru.progwards.java1.lessons.params;

import java.nio.ByteBuffer;
import java.util.Arrays;

public class ArrayInteger {
    byte[] digits;
    int n;
    ArrayInteger(int n){
        digits=new byte[n];
        this.n=n;
    }
    //установить свое значение, взяв его из value (уложить числовое значение value во внутренний массив)
    void fromString(String value) { 
        String[] strArr = value.split("");
        digits = new byte[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            digits[i] = Byte.parseByte(strArr[i]);
        }
    }
    @Override
    public String toString(){
        return Arrays.toString(digits);
    }

    boolean add(ArrayInteger num){
        boolean ok=true;
        byte[] finMass=new byte[n];
        int lengthNewMas;
        if (num.n > digits.length) {
            lengthNewMas = num.n;
        } else {
            lengthNewMas = digits.length;
        }
        ArrayInteger fin = new ArrayInteger(lengthNewMas);
        int firstD= ByteBuffer.wrap(digits).getInt();
        int secondD= ByteBuffer.wrap(num.digits).getInt();
        int sum = firstD+secondD;
        String sumStr = Integer.toString(sum);

        if (sumStr.length() > lengthNewMas) {
            ok = false;
            for (int i = 0; i < finMass.length; i++) {
                finMass[i] = 0;
            }
        }
        else {
            fromString(sumStr);
            }

        return ok;
    }

    public static void main(String[] args) {
        ArrayInteger w =new ArrayInteger(3);
        w.fromString("121");
    }
}
