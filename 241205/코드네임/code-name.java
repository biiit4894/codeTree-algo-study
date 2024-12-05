import java.util.Scanner;

class Agent {
    String codeName;
    int score;

    public Agent(String codeName, int score) {
        this.codeName = codeName;
        this.score = score;
    }
};

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Agent[] agents = new Agent[5];
        for(int i = 0; i < 5; i++) {
            String codeName = sc.next();
            int score = sc.nextInt();
            agents[i] = new Agent(codeName, score);
        } 

        // 점수의 최솟값을 계속 저장할 필요 없이 최소 점수를 갖는 요원 번호만 가져와도 충분
        int minIdx = 0;
        for(int i = 0; i < 5; i++) {
            if(agents[minIdx].score > agents[i].score) {
                minIdx = i;
            }
        }
        System.out.println(agents[minIdx].codeName + " " + agents[minIdx].score);

        
    }
}