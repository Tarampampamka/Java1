package experience;

import java.util.Arrays;

public class maxPlusMinim {
    //Реализуйте функцию, возвращающую сумму максимального и минимального по значению элементов массива.
    // Если в массиве 0 элементов, вернуть 0.
    public static int maxPlusMin(int[] a) {
        int res = 0;
        if (a.length > 0) {
            if (a.length == 1) {
                res=a[0];}
            else {
                Arrays.sort(a);
                res = a[0] + a[a.length - 1];
            }
            }
            return res;
        }

    public static void main(String[] args) {
        int[] a = {0};
        System.out.println(maxPlusMin(a));
    }
}
