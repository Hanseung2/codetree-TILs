import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void recursion(int N) {
        if (N == 0)
            return;
        for (int i = 0; i <N; i++) {
            System.out.print("* ");
        }
        System.out.println();
        recursion(N-1);
        for (int i = 0; i <N; i++) {
            System.out.print("* ");
        }
        System.out.println();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        recursion(N);
    }
}