import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void printGCD(int n, int m) {
        int minNum = Math.min(n, m);
        while(true){
            if(n%minNum==0 && m%minNum==0)
                break;
            minNum --;
        }
        System.out.print(minNum);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        printGCD(n,m);
    }
}