package ru.progwards.java1.lessons.cycles;

public class GoldenFibo {

    //возвращает n-ое число Фибоначчи (нумерация начинается с 1, то есть при n = 3 должно вернуться
    // число Фибоначчи 2, а при n = 10 число 55
    public static int fiboNumber(int n){
        int Res1=1, Res2=1, Res=1;
        if (n==1||n==2);
            else {
            for (int i = 3; i <= n; i++) {
                Res = Res1 + Res2;
                Res1 = Res2;
                Res2 = Res;
            }
        }
            return Res;
    }

    //возвращает true, если треугольник со сторонами a, b, c является Золотым. Определим критерии.
    // Он должен быть равнобедренным и отношение ребра к основанию должно лежать между значениями 1.61703 и 1.61903.
    public static boolean isGoldenTriangle(int a, int b, int c){
        boolean isGolTr=true;
        double f1=(double) a / (double) c, f2=(double) a / (double) b, f3=(double) c / (double) a;
        if ((a==b) && 1.61703 < f1 && f1 < 1.61903)
            isGolTr=true;
        else if ((a==c) && 1.61703 < f2 && f2 < 1.61903)
            isGolTr=true;
        else if ((b==c) && 1.61703 < f3 && f3 < 1.61903)
            isGolTr=true;
            else isGolTr=false;
            return isGolTr;
    }
    public static void main(String[] args) {
        for (int n = 1; n <= 15; n++)          //вывести на консоль, используя цикл, 15 первых чисел Фибоначчи
            System.out.print(fiboNumber(n) + " ");

        /*используя вложенные циклы, определить: есть ли среди треугольников, длины сторон которых являются
        натуральными числами Фибоначчи, не превышающими 100, Золотые треугольники. Таким образом одно число
        Фибоначчи является длиной основания треугольника, а следующее является длиной ребер. И если найдены
        Золотые треугольники, вывести на консоль длины основания и рёбер этих треугольников.
         */
        for (int q = 1; fiboNumber(q+1) <= 100; q++) {
            if (isGoldenTriangle(fiboNumber(q), fiboNumber(q+1), fiboNumber(q+1))) {
                System.out.print(fiboNumber(q) + " ");
                System.out.print(fiboNumber(q+1) + " ");
                System.out.println(fiboNumber(q+1));
            }
        }
    }
}