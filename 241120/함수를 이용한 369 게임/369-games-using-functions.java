import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static boolean is369(int num)
    {
        boolean flag = false;
        while(num!=0){
            if(num%10==3 || num%10==6 || num%10==9)
                flag = true;
            num=num/10;
        }
        return flag;
    }
    public static void function369(int n, int m) {
        int cnt = 0;
        for (int i = n; i <= m ; i++) {
            if(is369(i))
                cnt++;
            else if(i%3==0)
                cnt++;
        }
        System.out.println(cnt);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        function369(n,m);
    }
}