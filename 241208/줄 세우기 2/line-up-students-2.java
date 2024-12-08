import java.util.Scanner;
import java.util.Arrays;

class Student implements Comparable<Student> {
    int height, weight, index;

    public Student(int height, int weight, int index) {
        this.height = height;
        this.weight = weight;
        this.index = index;
    }

    @Override
    public int compareTo(Student student) {
        if(height != student.height) {
            return height - student.height;
        }
        return student.weight - weight;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Student[] students = new Student[n];

        int height, weight;
        for(int i = 0; i < n; i++) {
            height = sc.nextInt();
            weight = sc.nextInt();
            students[i] = new Student(height, weight, i + 1);
        }

        Arrays.sort(students, 0, n);

        for(int i = 0; i < n; i++) {
            System.out.println(students[i].height + " " + students[i].weight + " " + students[i].index);
        }
    }
}