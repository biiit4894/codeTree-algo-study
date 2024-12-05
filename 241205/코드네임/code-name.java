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

        int minScore = 1000;
        int agentIdx = 0;
        for(int i = 0; i < 5; i++) {
            if(minScore > agents[i].score) {
                minScore = agents[i].score;
                agentIdx = i;
            }
        }
        System.out.println(agents[agentIdx].codeName + " " + agents[agentIdx].score);

        
    }
}