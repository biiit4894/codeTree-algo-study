import java.util.Scanner;

class ForeCast {
    String date;
    String day;
    String weather;

    public ForeCast(String date, String day, String weather) {
        this.date = date;
        this.day = day;
        this.weather = weather;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ForeCast[] forecasts = new ForeCast[n];


        for(int i = 0; i < n; i++) {
            String date = sc.next();
            String day = sc.next();
            String weather = sc.next();
            forecasts[i] = new ForeCast(date, day, weather);
        }

        int rainIdx = 0;
        for(int i = 0; i < n; i++) {

            String currentWeather = forecasts[rainIdx].weather;
            String targetWeather = forecasts[i].weather;

            
            int targetYear = Integer.parseInt(forecasts[i].date.substring(0, 4));
            int currentYear = Integer.parseInt(forecasts[rainIdx].date.substring(0, 4));

            if(!currentWeather.equals("Rain") && targetWeather.equals("Rain")) {
                rainIdx = i;
            } else if(currentWeather.equals("Rain") && targetWeather.equals("Rain")) {
                
                if(targetYear < currentYear) {
                    rainIdx = i;
                } else if(targetWeather == currentWeather) {
                    int month1 = Integer.parseInt(forecasts[i].date.substring(5, 7));
                    int month2 = Integer.parseInt(forecasts[rainIdx].date.substring(5, 7));
                    if(month1 < month2) {
                        rainIdx = i;
                    } else {
                        int day1 = Integer.parseInt(forecasts[i].date.substring(8));
                        int day2 = Integer.parseInt(forecasts[rainIdx].date.substring(8));
                        if(day1 < day2) {
                            rainIdx = i;
                        }
                    }
                }
            } 
            
        }
        System.out.println(forecasts[rainIdx].date + " " + forecasts[rainIdx].day + " " + forecasts[rainIdx].weather);
    }
}