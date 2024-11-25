import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        int[] A = new int[n];
        int[] B = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = Integer.parseInt(input[i]);
        }
        String[] input2 = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            B[i] = Integer.parseInt(input2[i]);
        }
        Arrays.sort(A);
        Arrays.sort(B);

        for (int i = 0; i < n; i++) {
            if (A[i] != B[i]) {
                System.out.println("No");
                break;
            }
            if(i==n-1)
                System.out.println("Yes");
        }
    }
}