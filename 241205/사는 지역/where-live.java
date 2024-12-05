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
        String[] names = new String[n];

        for(int i = 0; i < n; i++) {
            String name = sc.next();
            String houseNumber = sc.next();
            String region = sc.next();
            users[i]= new User(name, houseNumber, region);
            names[i] = name;
        }

        Arrays.sort(users, new Comparator<User>() {
            public int compare(User user1, User user2) {
                if(user1.name.length() == user2.name.length()) {
                    return user1.name.compareTo(user2.name);
                } else {
                    return user1.name.length() - user2.name.length();
                }
            }
        });

        // for(int i = 0; i < n; i++) {
        //     System.out.println("name " + (i + 1) + " : " + names[i]);
        // }

        System.out.println("name " + users[n - 1].name);
        System.out.println("addr " + users[n - 1].houseNumber);
        System.out.println("city " + users[n - 1].region);
    }
}