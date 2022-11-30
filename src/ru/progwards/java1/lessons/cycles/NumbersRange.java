package ru.progwards.java1.lessons.cycles;

//возвращает сумму чисел от start до finish включительно
public class NumbersRange {
    public static long sumNumbers(int start, int finish){
        long Res=0l;
        for (int i = start; i <= finish; i++)
            Res = Res + i;
            return Res;
    }
//возвращает сумму чисел от start до finish включительно, при этом складывать нужно только четные числа..
    public static long sumOdd(int start, int finish){
        long Res_sumOdd=0l;
        for (int i = start; i <= finish; i++) {
            if (i%2 == 0)
            Res_sumOdd = Res_sumOdd + i;
            else continue;
        }
        return Res_sumOdd;
    }

    //возвращает сумму чисел от start до finish включительно, при этом складывать нужно только числа
    // с нечетными индексами в последовательности, считая от 1
    public static long sumEvenIdx(int start, int finish){
        long Res_sumEven=0l;
        int d=1;
        for (int i = start; i <= finish; i++) {
            if (d%2 != 0)
                Res_sumEven = Res_sumEven + i;
            d++;
        }
        return Res_sumEven;
    }
    public static void main(String[] args) {
        System.out.println(sumNumbers(1,25));
        System.out.println(sumOdd(12,22));
        System.out.println(sumEvenIdx(12,22));
    }
}
