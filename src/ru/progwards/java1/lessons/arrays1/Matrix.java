package ru.progwards.java1.lessons.arrays1;

public class Matrix {
    private int[][] m;
    public Matrix(int[][] matrix){
    m =matrix;
    }
    //найти максимальный элемент в строке num
    public int maxInRow(int num){
        int temp=-2147483648;
        for (int i = 0; i < m[num].length; i++) {
                if(m[num][i]<=temp){
                    continue;
                }
                else {
                    temp = m[num][i];
                }
            }
        return temp;
    }
    //найти максимальный элемент в колонке num
    public int maxInCol(int num){
        int res=-2147483648;
        for (int i = 0; i < m.length; i++) {
            if (num < m[i].length) {
                if (m[i][num] <= res) {
                    continue;
                } else {
                    res = m[i][num];
                }
            }
                continue;
            }
        return res;
    }
    //находит максимальный элемент во всем двумерном массиве
    public int max(){
        int maxElement=-2147483648;
        for (int j = 0;j<m.length;j++){
            if (maxElement<maxInRow(j))
                maxElement=maxInRow(j);
            else continue;
        }
        return maxElement;
    }
    //проверяет, является ли двумерный массив матрицей - количество элементов всех строк должно быть одинаковое
    public boolean isMatrix(){
        boolean matr=true;
        int j=m[0].length;
        for (int i = 1; i < m.length; i++){
            if (j==m[i].length){
            continue;}
            else matr=false;
        }
        return matr;
    }
    //транспонирует матрицу. Если двумерный массив не является матрицей вернуть null. В противном случае вернуть транспонированную матрицу
    public int[][] transposition(){
        int [][] res=new int[m[0].length][m.length];
        if (isMatrix()==false){
            res = null;
        }
        else {for (int i = 0; i < m.length; i++){
            for (int j = 0; j < m[i].length; j++){
            res[j][i]=m[i][j];}
        }
        }
        return res;
    }
    public static void main(String[] args){
        int[][] m = {{}};
        System.out.println(new Matrix(m).max());
    }
}
