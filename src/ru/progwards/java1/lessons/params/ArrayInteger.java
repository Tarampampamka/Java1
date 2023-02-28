package ru.progwards.java1.lessons.params;
import java.util.Arrays;
public class ArrayInteger {
    byte[] digits;
    int n;
    //инициализирует класс, с максимальной точностью n цифр (размер массива)
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
        System.out.println(Arrays.toString(digits));
    }
    @Override
    public String toString(){
        return Arrays.toString(digits);
    }

    //сложить 2 числа, используя массив digits, фактически столбиком, как учили в школе в 5-м (или каком там)
    // классе. Результат поместить в свой экземпляр ArrayInteger, у которого был вызван метод.
    // При переполнении вернуть false, при этом само число сбросить в 0
    boolean add(ArrayInteger num) {
        boolean ok = true;
        //int j = n - 1;
        String out1 = "", out2 = "", outSum = "";
        int q, w, sum;

        for (int i = 0; i <= num.digits.length - 1; i++){
            out1= out1 + Byte.toString((byte) (num.digits[i]));
        }
        for (int j = 0; j < digits.length; j++){
            out2= out2 + Byte.toString((byte) (digits[j]));
        }
        q= Integer.parseInt(out1);
        w= Integer.parseInt(out2);
        sum = q+w;
       
        outSum = String.valueOf(sum);

        if (num.digits.length != outSum.length()) {
            ok = false;
            for (int l = 0; l < num.n; l++) {
                num.digits[l] = 0;
            }
        } else {
            String[] strArr = outSum.split("");
            num.digits = new byte[strArr.length];
            for (int i = 0; i < strArr.length; i++) {
                num.digits[i] = Byte.parseByte(strArr[i]);
            }
        }
        return ok;
    }

    public static void main(String[] args) {
        ArrayInteger w =new ArrayInteger(3);
        w.fromString("691");
        ArrayInteger q =new ArrayInteger(2);
        q.fromString("12");
        w.add(q);
    }
}
