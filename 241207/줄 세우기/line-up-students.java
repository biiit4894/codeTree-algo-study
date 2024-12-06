import java.util.Scanner;
import java.util.Arrays;

class Student implements Comparable<Student> {
    int num, height, weight;

    public Student(int num, int height, int weight) {
        this.num = num;
        this.height = height;
        this.weight = weight;
    }

    
    // 조건문 이렇게도 가능하니까 잘 생각하자
    @Override
    public int compareTo(Student student) {
        if(this.height != student.height) {
            return student.height - this.height; // 키 내림차순
        }

        if(this.weight != student.weight) {
            return student.weight - this.weight; // 몸무게 내림차순
        }

        return this.num - student.num; // 번호 오름차순
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