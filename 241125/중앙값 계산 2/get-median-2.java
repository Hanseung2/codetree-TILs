import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static int midFunc(int[] arr, int idx)
    {
        int index = (idx+1)/2;
        Arrays.sort(arr,0,idx+1);
        return arr[index];
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        String[] inputs = br.readLine().split(" ");
        int[] elements = new int[n];
        for (int i = 0; i <n; i++) {
            elements[i] = Integer.parseInt(inputs[i]);
        }
        for (int i = 0; i < n; i++) {
            if((i+1)%2!=0){
                System.out.println(midFunc(elements, i));
            }
        }

    }
}