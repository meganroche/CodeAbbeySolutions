import java.util.Scanner;

public class TwoPrinters {

    public static void main(String[] args) {

         Scanner sc = new Scanner(System.in);
         int loops = sc.nextInt();
         sc.nextLine();

         for(int i=0; i<loops; i++){

             int j=0,x=sc.nextInt(),y=sc.nextInt(),n=sc.nextInt();
             long k=0;

             while(j<n){
                 k++;
                 if(k%x==0){
                     j++;
                 }
                 if(k%y==0){
                     j++;
                 }
             }
           System.out.printf("%d ",k);
         }
    }
}