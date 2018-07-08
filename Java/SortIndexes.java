import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

class Element implements Comparable<Element> {

    int index, value;

    Element(int index, int value){
        this.index = index;
        this.value = value;
    }

    public int compareTo(Element e) {
        return this.value - e.value;
    }
}

public class SortIndexes {
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        int loops = sc.nextInt();
        int[] array = new int[loops];
        sc.nextLine();
        
        for(int i=0;i<loops;i++){
            array[i] = sc.nextInt();
        }
        
        // Init the element list
        List<Element> elements = new ArrayList<Element>();
        for (int i = 0; i < array.length; i++) {
            elements.add(new Element(i, array[i]));
        }
        
        // Sort and print
        Collections.sort(elements);
        // Collections.reverse(elements); // If you want reverse order
        for (Element element : elements) {
            // System.out.printf("%d %d ",element.value,(element.index + 1));
            System.out.printf("%d ",(element.index + 1));
        }
    }
}