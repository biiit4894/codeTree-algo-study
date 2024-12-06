import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

class Person {
    String name;
    int height;
    double weight;

    public Person(String name, int height, double weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }
} 

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person[] people = new Person[5];
        for(int i = 0 ; i < 5; i++) {
            String name = sc.next();
            int height = sc.nextInt();
            double weight = sc.nextDouble();
            people[i] = new Person(name, height, weight);
        }

        Arrays.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person person1, Person person2) {
                return person1.name.compareTo(person2.name); // String.compareTo() 메서드로 사전식 순서로 문자열을 비교해 정렬해야 함
            }
        });

        System.out.println("name");
        for(int i = 0; i < 5; i++) {
            System.out.println(people[i].name + " " + people[i].height + " " + people[i].weight); // %.1f까지 사용하면 완벽할 것
        }

        Arrays.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person person1, Person person2) {
                return person2.height - person1.height;
            }
        });
        
        System.out.println();

        System.out.println("height");
        for(int i = 0; i < 5; i++) {
            System.out.println(people[i].name + " " + people[i].height + " " + people[i].weight); // %.1f까지 사용하면 완벽할 것
        }

    }
}