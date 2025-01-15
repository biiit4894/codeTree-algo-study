import java.util.Scanner;
// 해설 풀이
public class Main {

    // 전역 변수 선언:
    // 이미 방문한 적이 있다면 true / 아니라면 false로 표시
    public static boolean[][] visited = new boolean[100][100];

    // 함수 선언:
    public static boolean canGo(int n, int m, int newX, int newY) {
        // 나아가려는 위치가 직사각형 안에 들어 있는지 확인하고
        // 들어있다면 아직 방문한 적이 없는 곳인지 판단한다.
        if(0 <= newX && newX < n && 0 <= newY && newY < m && visited[newX][newY] == false) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 변수 선언:
        int n, m;
        char[][] answer = new char[100][100];

        // 입력: 
        n = sc.nextInt();
        m = sc.nextInt();

        // direction에 따라 바뀌는 (x, y)의 변화량인 dx, dy를 정의한다.
        int[] dx = new int[]{0, 1, 0, -1};
        int[] dy = new int[]{1, 0, -1, 0};
        int currX = 0, currY = 0; // 시작은 (0, 0)
        int direction = 0; // 0: 오른쪽, 1: 아래쪽, 2: 왼쪽, 3: dnlWhr

        // 처음 시작 위치에 초기값을 적는다.
        answer[currX][currY] = 'A';
        visited[currX][currY] = true;

        // n*m개의 알파벳을 적는다.
        for(int i = 1; i < n * m; i++) {
            while(true) {
                int nx = currX + dx[direction];
                int ny = currY + dy[direction];
                if(canGo(n, m, nx, ny)) {
                    currX = nx;
                    currY = ny;
                    visited[currX][currY] = true;
                    answer[currX][currY] = (char)(i % 26 + 65); // + 'A' 대신 + 65도 괜찮은듯?
                    break;
                } else {
                    direction = (direction + 1) % 4;
                }
            }
        }

        // 출력:
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                System.out.print(answer[i][j] + " ");
            }
            System.out.println();
        }
    }
}