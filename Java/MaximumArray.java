import java.util.Scanner;
import java.util.Arrays;

public class MaximumArray {
    public static void main(String[] args){ 

        Scanner sc = new Scanner(System.in);
        int[] array = new int[300];
        int i=0;

        while(sc.hasNextInt()){
            array[i] = sc.nextInt();
            i++;
        }
        Arrays.sort(array);
        System.out.printf("%d %d ",array[299],array[0]);
        sc.close();
    }
}