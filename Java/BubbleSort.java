import java.util.Scanner;
import java.util.Arrays;

public class BubbleSort {
    
    public static void main(String args[]) {
        
        int swapCount = 0, passCount = 0;
        Scanner sc = new Scanner(System.in);
        int arrayLength = sc.nextInt();
        int[] array = new int[arrayLength];
        sc.nextLine();

        for(int i=0;i<arrayLength;i++){
            array[i] = sc.nextInt();
        }
        for(int k=0;k<arrayLength;k++){
            boolean swapped = false;
            for(int j=1;j<arrayLength-k;j++){
                int temp = array[j];
                if(temp<array[j-1]){
                    array[j] = array[j-1];
                    array[j-1] = temp;
                    swapCount++;
                    swapped = true;
                }
            }
            if(swapped == false){
            passCount = k+1;
            break;
            }
        }
        System.out.printf("%d %d",passCount,swapCount);
    }
}