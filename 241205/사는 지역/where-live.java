import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

class User {
    String name;
    String houseNumber;
    String region;

    public User(String name, String houseNumber, String region) {
        this.name = name;
        this.houseNumber = houseNumber;
        this.region = region;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        User[] users = new User[n];

        for(int i = 0; i < n; i++) {
            String name = sc.next();
            String houseNumber = sc.next();
            String region = sc.next();
            users[i]= new User(name, houseNumber, region);
        }

        int lastIdx = 0;
        for(int i = 1; i < n; i++) {
            if(users[i].name.compareTo(users[lastIdx].name) > 0) {
                lastIdx = i;
            }
        }

        System.out.println("name " + users[lastIdx].name);
        System.out.println("addr " + users[lastIdx].houseNumber);
        System.out.println("city " + users[lastIdx].region);
    }
}