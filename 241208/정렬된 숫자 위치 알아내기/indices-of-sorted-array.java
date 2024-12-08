import java.util.Scanner;
import java.util.Arrays;

class Element implements Comparable<Element>{
    int value, index;
    public Element(int value, int index) {
        this.value = value;
        this.index = index;
    }

    @Override
    public int compareTo(Element element) {
        if(this.value != element.value) {
            return this.value - element.value;
        }
        return this.index - element.index;
    }

}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Element[] elements = new Element[n];

        for(int i = 0; i < n; i++) {
            int value = sc.nextInt();
            elements[i] = new Element(value, i);
        }

        Arrays.sort(elements, 0, n);

        int[] indexes = new int[n + 1];
        for(int i = 0; i < n; i++) {
            indexes[elements[i].index] = i + 1;
        }

        for(int i = 0; i < n; i++) {
            System.out.print(indexes[i] + " ");
        }

    }
}