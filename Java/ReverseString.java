import java.util.Scanner;

public class ReverseString {
    
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        
        while(sc.hasNext()) {
            
            String line = sc.next(),reverse = "";
            int loops = line.length();
            
            for(int i=0; i<loops; i++){
                reverse = line.charAt(i) + reverse;
            }
            System.out.printf("%s ",reverse);
        }
    }
}