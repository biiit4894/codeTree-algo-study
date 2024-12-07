import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

class Person {
    String name;
    int height, weight;

    public Person(String name, int height, int weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Person[] people = new Person[n];
        for(int i = 0; i < n ; i++) {
            String name = sc.next();
            int height = sc.nextInt();
            int weight = sc.nextInt();
            people[i] = new Person(name, height, weight);
        }
        Arrays.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person person1, Person person2) {
                if(person1.height != person2.height) {
                    return person1.height - person2.height;
                }
                return person2.weight - person1.weight;

            }
        });

        for(int i= 0 ; i < n; i++) {
            System.out.println(people[i].name + " " + people[i].height + " " + people[i].weight);
        }
    }
}