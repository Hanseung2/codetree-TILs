import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static int recursion(int N) {
        if (N == 1)
            return 1;
        else if (N == 2)
            return 2;

        return recursion(N/3) + recursion(N - 1);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        System.out.println(recursion(N));
    }
}