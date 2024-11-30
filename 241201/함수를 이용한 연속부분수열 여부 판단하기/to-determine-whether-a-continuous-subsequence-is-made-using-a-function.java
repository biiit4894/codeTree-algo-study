import java.util.Scanner;
import java.util.List;

public class Main {
    public static boolean isContinuousPartialSequence(int[] arr1, int[] arr2) {
        boolean isPartialSequence = false;

        for(int i = 0; i < arr2.length - 1; i++) {
            for(int j = 0; j < arr1.length; j++) {
                if(arr2[i] == arr1[j]) {
                    isPartialSequence = true;
                })
                if(arr2[i] == arr1[j] && arr2[i+1] != arr1[j+1]) {
                    return false;
                }
            }
        }
        if(!isPartialSequence) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int[] arr1 = new int[n1];
        for(int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        int[] arr2 = new int[n2];
        for(int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        if(isContinuousPartialSequence(arr1, arr2)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}