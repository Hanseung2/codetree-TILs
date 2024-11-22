import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static int recursion(int[] arr, int N) {
        if (N == 0) {
            return arr[0];
        }
        //배열, 인덱스를 인자로 주고 max()에서 그 값을 재귀로 비교
        return Math.max(recursion(arr, N - 1), arr[N]);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        String[] input = br.readLine().split(" ");
        int[] element = new int[N];
        for (int i = 0; i < N; i++) {
            element[i] = Integer.parseInt(input[i]);
        }

        int maxValue = recursion(element, N-1);
        System.out.println(maxValue);
    }
}