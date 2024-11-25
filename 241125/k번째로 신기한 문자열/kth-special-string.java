import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[1]);
        String T = input[2];
        String[] words = new String[n];
        for (int i = 0; i < n; i++) {
            words[i] = br.readLine();
        }
        Arrays.sort(words);
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if(words[i].startsWith(T))
                cnt++;
            if(cnt==k) {
                System.out.println(words[i]);
                break;
            }
        }
    }
}