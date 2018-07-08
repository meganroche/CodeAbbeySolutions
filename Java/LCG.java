import java.util.Scanner;

public class LCG {
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        int loops = sc.nextInt();
        sc.nextLine();
        
        for(int i=0; i<loops; i++){
            int A = sc.nextInt(),C = sc.nextInt(),M = sc.nextInt(),res = sc.nextInt(),N = sc.nextInt();
            for(int j=0;j<N;j++){
                res = (A*res+C)%M;
            }
            System.out.printf("%d ",res);
        }
    }
}