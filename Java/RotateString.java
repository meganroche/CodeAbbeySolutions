import java.util.Scanner;

public class RotateString {
    
    public static String rotate(String s, int offset) {
          int i = offset % s.length();
          return s.substring(i) + s.substring(0, i);
    }

    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        int loops = sc.nextInt();
        sc.nextLine();
        
        for(int i=0;i<loops;i++){
            int n = sc.nextInt();
            String s = sc.next();
            if(n>0){
                System.out.printf("%s ",rotate(s,n));
            }
            else {
                n = s.length() + n;
                System.out.printf("%s ",rotate(s,n));
            }
        }
    }
} 