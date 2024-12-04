import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String t = sc.next();
        String[] arr = new String[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }
        Arrays.sort(arr);


        ArrayList<String> arr2 = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            if(arr[i].startsWith(t)) {
                arr2.add(arr[i]);
            }
        }
        System.out.println(arr2.get(k - 1));

        
    }
}