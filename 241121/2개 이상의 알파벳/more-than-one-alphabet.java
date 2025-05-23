import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static boolean isDoubleAlphabet(String line) {
        boolean flag = false;
        for (int i = 0; i < line.length(); i++) {
            if(line.charAt(i)!=line.charAt(0))
                flag = true;
        }
        return flag;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        if(isDoubleAlphabet(input))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}