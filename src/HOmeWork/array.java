package HOmeWork;
public class array {
    /*public static int arraysSum(int[] a){
        int q=0;
        for (int i =0;i<a.length;i++){
            q=a[i]+q;
        }
        return q;
    }

    public static void main(String[] args) {
        int[] a = {12,17,0};
        int sum = arraysSum(a);
        System.out.println(sum);
    }
}*/
   /* public static int arraySum2(int[][] m, int n){
        int res=0;
        int j;
        if (m.length!=1) {
            for (int i = 0; i < m.length; i++) {
                for (j = 0; j < n; ) {
                    j++;
                }
                res = res + m[i][j];
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[][] m = {{1,2,3}, {10,20,30}, {11,12,13}};
        int sum = arraySum2(m, 2);
        System.out.println(sum);
    }*/
    public static int arraySum2(int[][] m, int n){
        int res=0;
        if (m.length!=1) {
            for (int i = 0; i < m[n].length; i++) {
                res = res + m[n][i];
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[][] m = {{1,2,3}, {10,20,30}, {11,12,13}};
        int sum = arraySum2(m, 0);
        //int[][] m = {{}};
        //int sum = arraySum2(m, 0);
        System.out.println(sum);
    }
}