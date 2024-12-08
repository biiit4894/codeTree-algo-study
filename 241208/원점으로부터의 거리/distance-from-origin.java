import java.util.Scanner;
import java.util.Arrays;

class Point implements Comparable<Point> {
    int num, x, y;
    public Point(int num, int x, int y) {
        this.num = num;
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point point) {
        int distance1 = Math.abs(this.x) + Math.abs(this.y);
        int distance2 = Math.abs(point.x) + Math.abs(point.y);
        if(distance1 != distance2) {
            return distance1 - distance2;
        } 
        return this.num - point.num;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Point[] points = new Point[n];

        for(int i = 0; i < n; i++) {
            int num = i + 1;
            int x = sc.nextInt();
            int y = sc.nextInt();
            points[i] = new Point(num, x, y);
        }

        Arrays.sort(points, 0, n);

        for(int i = 0; i < n; i++) {
            System.out.println(points[i].num);
        }

    }
}