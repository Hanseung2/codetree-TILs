import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static int calculateSum(int[] element, int a1, int a2) {
        int sum = 0;
        for (int i = a1-1; i <a2; i++) {
            sum+=element[i];
        }
        return sum;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);

        String[] elements = br.readLine().split(" ");
        int[] element = new int[n];
        for (int i = 0; i < n; i++) {
            element[i] = Integer.parseInt(elements[i]);
        }

        for (int i = 0; i < m; i++) {
            String[] pair = br.readLine().split(" ");
            int a1 = Integer.parseInt(pair[0]);
            int a2 = Integer.parseInt(pair[1]);
            System.out.println(calculateSum(element, a1, a2));
        }

    }
}