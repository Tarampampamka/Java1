package experience;

import java.util.Arrays;

//метод, который используя метод класса Arrays приводит массив к строке.
public class massiveToString {
    /*static String arrayToString(int []a){
        String S= Arrays.toString(a);
        System.out.println(S);
        return S;
    }

    public static void main(String[] args) {
        int[] a = {0,5,2,24,78,4,1,0,89,2};
        arrayToString(a);
    }
}*/
//метод, который используя методы класса Arrays сортирует массив и приводит его к строке.
    static String sortAndToString(int[] a) {
        Arrays.sort(a);
        return Arrays.toString(a);
    }
    public static void main(String[] args) {
        int[] a = {0,5,2,24,78,4,1,0,89,2};
        System.out.println(sortAndToString(a));
    }
}