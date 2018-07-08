import java.util.Scanner;
import java.util.Arrays;

public class ArrayCounters {
    
        public static void main(String[] args){  
        
        Scanner sc = new Scanner(System.in);
        int loops = sc.nextInt();
        int uniqVals = sc.nextInt();
        int[] array = new int[loops];
        sc.nextLine();

        for(int i=0; i<loops; i++){

            array[i] = sc.nextInt();
        }
        
        Arrays.sort(array);
        int a = array[0];
        int count = 0;
        
        for (int j=0; j<loops; j++) {
            
            int b = array[j];
            if (a == b) {
                count++;
            }
            else {
            System.out.printf("%d ",count);
            a = b;
            count = 1;
            }
        }
        System.out.printf("%d ",count);
    }
}