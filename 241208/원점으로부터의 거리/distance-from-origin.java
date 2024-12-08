import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

class Point {
    int num, x, y;
    public Point(int num, int x, int y) {
        this.num = num;
        this.x = x;
        this.y = y;
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

        Arrays.sort(points, new Comparator<Point>() {
            @Override
            public int compare(Point point1, Point point2) {
                int distance1 = Math.abs(point1.x + point1.y);
                int distance2 = Math.abs(point2.x + point2.y);
                if(distance1 != distance2) {
                    return distance1 - distance2;
                } 
                return point1.num - point2.num;
            }
            
        });

        for(int i = 0; i < n; i++) {
            System.out.println(points[i].num);
        }

    }
}