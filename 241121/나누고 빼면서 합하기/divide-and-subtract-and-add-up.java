import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    
    public static int calculateSum(int[] A, int m) {
        int sum = 0;
        
        while (m > 1) {
            sum += A[m - 1]; 
            if (m % 2 == 0) {
                m /= 2;
            } else {
                m -= 1;
            }
        }
        
        sum += A[m - 1];
        return sum;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        
        String[] inputA = br.readLine().split(" ");
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = Integer.parseInt(inputA[i]);
        }
        
        int result = calculateSum(A, m);
        System.out.println(result);
    }
}