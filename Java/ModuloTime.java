import java.util.Scanner;

public class ModuloTime {
    
    public static void main(String args[]) {
        
        
        Scanner sc = new Scanner(System.in);
        int Loops = sc.nextInt();
        sc.nextLine();
        
        for(int i=0; i<Loops;i++){
            
            int d1 = sc.nextInt(),h1 = sc.nextInt(),m1 = sc.nextInt(),s1 = sc.nextInt(),d2 = sc.nextInt(),h2 = sc.nextInt(),m2 = sc.nextInt(),s2 = sc.nextInt();
            int s,m,h,d;

            if(s2 >= s1) {
                s = s2 - s1;
            }
            else {
                m2 -= 1;
                s2 += 60;
                s = s2 - s1;
            }
            if(m2 >= m1) {
                m = m2 - m1;
            }
            else {
                h2 -= 1;
                m2 += 60;
                m = m2 - m1;
            }
            if(h2 >= h1){
                h = h2 - h1;
            }
            else {
                d2 -= 1;
                h2 += 24;
                h = h2 - h1;
            }
            d = d2 - d1;
            System.out.printf("(%d %d %d %d) ",d,h,m,s);
        }
        sc.close();
    }
}