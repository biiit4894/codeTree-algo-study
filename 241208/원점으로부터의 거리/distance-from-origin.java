import java.util.Scanner;
import java.util.Arrays;
// 해설 : 좌표 모두 저장 없이 맨해튼 거리만 저장해도 괜찮음
class Point implements Comparable<Point> {
    int dist;
    int index;

    public Point(int dist, int index) {
        this.dist = dist;
        this.index = index;
    }

    @Override
    public int compareTo(Point point) {
        if(dist != point.dist) {
            return dist - point.dist;
        } 
        return index - point.index;
    }
}

public class Main {

    // 원점과의 거리를 계산하는 함수
    public static int getDistFromOrigin(int x, int y) {
        return Math.abs(x) + Math.abs(y);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Point[] points = new Point[n];

        for(int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            // 원점과의 거리와 index를 저장
            points[i] = new Point(getDistFromOrigin(x, y), i + 1);
        }

        Arrays.sort(points, 0, n);

        for(int i = 0; i < n; i++) {
            System.out.println(points[i].index);
        }

    }
}