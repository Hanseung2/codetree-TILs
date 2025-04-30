import java.util.Scanner;

class PredictWeather {
    private String date;
    private String day;
    private String weather;

    public PredictWeather(String date, String day, String weather){
        this.date = date;
        this.day = day;
        this.weather = weather;
    }

    public String getDate() {return date;}
    public String getDay() {return day;}
    public String getWeather() {return weather;}

}
public class Main {
    public static final int MAX_N = 100;

    public static PredictWeather[] predictWeather = new PredictWeather[MAX_N];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String date = sc.next();
            String day = sc.next();
            String weather = sc.next();
            predictWeather[i] = new PredictWeather(date, day, weather);
        }

        int index = -1;
        for (int i = 0; i < n; i++) {
            if (predictWeather[i].getWeather().equals("Rain")) {
                if (index == -1 || predictWeather[i].getDate().compareTo(predictWeather[index].getDate()) < 0) {
                    index = i;
                }
            }
        }

        System.out.printf("%s %s %s",predictWeather[index].getDate(),predictWeather[index].getDay(),predictWeather[index].getWeather());
    }
}