package ru.progwards.java1.lessons.useclasses;

public class ComplexNum {
    int real, imag;

    public ComplexNum(int a, int b){
        real=a;
        imag=b;
    }
    public String toString(){
        String Complex = real+"+"+imag+"i";
        return Complex;
    }
    //сложение комплексных чисел по формуле:
    //(a + bi) + (c + di) = (a + c) + (b + d)i
    public ComplexNum add(ComplexNum num){
        int real2=real+ num.real, imag2=imag+ num.imag;
        ComplexNum Res = new ComplexNum(real2,imag2);
        return Res;
    }
    //вычитание комплексных чисел по формуле:
    //(a + bi) - (c + di) = (a - c) + (b - d)i
    public ComplexNum sub(ComplexNum num){
        int real2=real- num.real, imag2=imag- num.imag;
        ComplexNum Res = new ComplexNum(real2,imag2);
        return Res;
    }
    //умножение комплексных чисел по формуле:
    //(a + bi) * (c + di) = (a*c - b*d) + (b*c + a*d)i
    public ComplexNum mul(ComplexNum num){
        int real2=real* num.real-imag* num.imag, imag2=imag* num.real+real* num.imag;
        ComplexNum Res = new ComplexNum(real2,imag2);
        return Res;
    }
    //деление комплексных чисел по формуле:
    //(a + bi) / (c + di) = (a*c + b*d)/(c*c+d*d) + ((b*c - a*d)/(c*c+d*d))i
    public ComplexNum div(ComplexNum num){
        int real2=(real* num.real+imag* num.imag)/(num.real* num.real+ num.imag* num.imag), imag2=(imag* num.real-real* num.imag)/(num.real* num.real+ num.imag* num.imag);
        ComplexNum Res = new ComplexNum(real2,imag2);
        return Res;
    }

    /*public static void main(String[] args) {
        System.out.println(new ComplexNum(1,2).add(new ComplexNum(99,98)).toString());
        System.out.println(new ComplexNum(99, 98).sub(new ComplexNum(1, 2)).toString());
        System.out.println(new ComplexNum(1, 1).mul(new ComplexNum(99, 99)).toString());
        System.out.println(new ComplexNum(1000, 1000).div(new ComplexNum(100, 100)).toString());
    }*/
}
