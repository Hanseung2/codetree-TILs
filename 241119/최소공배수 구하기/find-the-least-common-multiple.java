import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void printLCM(int n, int m) {
        int maxNum = Math.max(n, m);
        int minNum = Math.min(n, m);
        int cnt = 2;
        int result = maxNum;
        while(true){
            if(result%minNum == 0)
                break;
            result = maxNum*cnt;
            cnt++;
        }
        System.out.println(result);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        printLCM(n,m);
    }
}