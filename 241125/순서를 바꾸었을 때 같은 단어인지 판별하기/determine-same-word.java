import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] a = br.readLine().toCharArray();
        char[] b = br.readLine().toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);

        boolean flag = false;
        for (int i = 0; i < a.length; i++) {
            if(a[i] != b[i]) {
                flag = true;
                break;
            }
        }
        if(flag) {
            System.out.print("No");
        }
        else {
            System.out.print("Yes");
        }
    }
}