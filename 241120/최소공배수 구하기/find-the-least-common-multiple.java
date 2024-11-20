import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static int GCD(int n, int m) {
        while(m!=0){
            int temp = m;
            m = n%m;
            n=temp;
        }
        return n;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        System.out.println(n*m / GCD(n,m));
    }
}