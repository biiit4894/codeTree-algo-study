import java.util.Scanner;
import java.util.Arrays;

class Student implements Comparable<Student> {
    int num, height, weight;

    public Student(int num, int height, int weight) {
        this.num = num;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public int compareTo(Student student) {
        if(this.weight == student.weight && this.height == student.height) {
            return this.num - student.num;
        } else if(this.height == student.height) {
            return student.weight - this.weight;
        } 
        return student.height - this.height;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student[] students = new Student[n];
        
        for(int i = 0; i < n; i++) {
            int h = sc.nextInt();
            int w = sc.nextInt();
            students[i] = new Student(i+1, h, w);
        }

        Arrays.sort(students);

        for(int i = 0; i < n; i++) {
            System.out.println(students[i].height + " " + students[i].weight + " " + students[i].num);
        }

    }
}