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
        String sortedA = new String(a);
        String sortedB = new String(b);

        if(sortedA.equals(sortedB))
            System.out.println("Yes");
        else System.out.println("No");
    }
}