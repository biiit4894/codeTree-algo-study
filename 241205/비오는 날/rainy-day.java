import java.util.Scanner;
// 해설
class Forecast {
    String date;
    String day;
    String weather;

    public Forecast(String date, String day, String weather) {
        this.date = date;
        this.day = day;
        this.weather = weather;
    }
}

public class Main {
    public static Forecast answer = new Forecast("9999-99-99", "", "");

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {
            String date = sc.next();
            String day = sc.next();
            String weather = sc.next();

            Forecast f = new Forecast(date, day, weather);
            if(weather.equals("Rain")) {
                // 비가 오는 경우 가장 최근인지 확인하고
                // 가장 최근일 경우 정답을 업데이트한다.
                if(answer.date.compareTo(f.date) > 0) {
                    answer = f;
                }
            }
        }

        System.out.println(answer.date + " " + answer.day + " " + answer.weather);
    }
}