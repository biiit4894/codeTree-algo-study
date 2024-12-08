import java.util.*;

public class Main {
    public static int[] days = {0,31,29,31,30,31,30,31,31,30,31,30,31};
    public static String[] week = {"Mon","Tue","Wed","Thu","Fri","Sat","Sun"};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        String str = sc.next();

        int total = countDay(m2,d2)-countDay(m1,d1);
        int index = findIndex(str);
        System.out.print(countWeek(index, total));
    }

    public static int countDay(int Month, int Day){
        int sum = 0;

        for(int i=1; i<Month; i++){
            sum += days[i];
        }
        return (sum+Day);
    }

    public static int findIndex(String temp){
        int t = -1;
        for(int i=0; i<7; i++){
            if(temp.equals(week[i])){
                t=i;
            }
        }
        return t;
    }

    public static int countWeek(int index, int total){
        int t = total/7;
        if(total%7 >= index){
            t++;
        }
        return t;
    }
}
