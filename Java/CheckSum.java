import java.util.Scanner;

public class CheckSum {
    
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        int loops = sc.nextInt();
        sc.nextLine();
        int seed = 113;
        long result = 0, limit = 10000007;
        
        for(int i=0; i < loops; i++) {
            
            result = (result + sc.nextInt()) * seed;
            
            if(result > limit) {
                result = result % limit;
            }
        }
        System.out.println(result);
    }
}