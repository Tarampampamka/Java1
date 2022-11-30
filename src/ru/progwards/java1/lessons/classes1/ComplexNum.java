package ru.progwards.java1.lessons.classes1;

public class ComplexNum {
    int c=3,d=7,real, imag;

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
        int real2=real+c, imag2=imag+d;
        ComplexNum Res = new ComplexNum(real2,imag2);
        return Res;
    }
    //вычитание комплексных чисел по формуле:
    //(a + bi) - (c + di) = (a - c) + (b - d)i
    public ComplexNum sub(ComplexNum num){
        int real2=real-c, imag2=imag-d;
        ComplexNum Res = new ComplexNum(real2,imag2);
        return Res;
    }
    //умножение комплексных чисел по формуле:
    //(a + bi) * (c + di) = (a*c - b*d) + (b*c + a*d)i
    public ComplexNum mul(ComplexNum num){
        int real2=real*c-imag*d, imag2=imag*c+real*d;
        ComplexNum Res = new ComplexNum(real2,imag2);
        return Res;
    }
    //деление комплексных чисел по формуле:
    //(a + bi) / (c + di) = (a*c + b*d)/(c*c+d*d) + ((b*c - a*d)/(c*c+d*d))i
    public ComplexNum div(ComplexNum num){
        int real2=(real*c+imag*d)/(c*c+d*d), imag2=(imag*c-real*d)/(c*c+d*d);
        ComplexNum Res = new ComplexNum(real2,imag2);
        return Res;
    }

    /*public static void main(String[] args) {
        ComplexNum W=new ComplexNum(8,15);
        System.out.println(W.add(W));
        System.out.println(W.sub(W));
        System.out.println(W.mul(W));
        System.out.println(W.div(W));
    }*/
}
