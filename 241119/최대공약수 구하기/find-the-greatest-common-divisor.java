import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void printGCD(int n, int m) {
        int maxNum;
        if (n>m)
            maxNum = n;
        else
            maxNum = m;
        while(true){
            if(n%maxNum==0 && m%maxNum==0)
                break;
            maxNum--;
        }
        System.out.print(maxNum);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        printGCD(n,m);
    }
}