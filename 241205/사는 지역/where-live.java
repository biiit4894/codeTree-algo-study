import java.util.Scanner;
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

        int maxIdx = 0;
        for(int i = 0; i < n; i++) {
            if(users[maxIdx].name.charAt(0) < users[i].name.charAt(0)) {
                maxIdx = i;
            } 
        }
        System.out.println("name " + users[maxIdx].name);
        System.out.println("addr " + users[maxIdx].houseNumber);
        System.out.println("city " + users[maxIdx].region);
    }
}