package arrays1;

public class Eratosthenes {
    int N, n;
    private boolean[] sieve;
    public Eratosthenes(int N){
        this.N=N+1;
        sieve= new boolean[N+1];
        for (int i=0;i<=N;i++){
            sieve[i]=true;
        }
        sift();
    }
    private void sift(){
        for (int i=2;i<=N-1;i++){
            for(int j=i+1;j<=N-1;j++)
                if (j%i != 0){
                    continue;
                }
                else sieve[j]=false;
                }
    }
    public boolean isSimple(int n){
        return sieve[n];
    }

    public static void main(String[] args) {
        System.out.println(new Eratosthenes(13).isSimple(13));
    }
}
