import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    
    public static class IntWrapper{
        int value;

        public IntWrapper(int value) {
            this.value = value;
        }
    }
    public static void calculateInteger(IntWrapper a, IntWrapper b) {
        int minNum = Math.min(a.value, b.value) + 10;
        int maxNum = Math.max(a.value, b.value) * 2;
        if (a.value > b.value) {
            a.value = maxNum;
            b.value = minNum;
        }
        else {
            a.value = minNum;
            b.value = maxNum;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        IntWrapper wrapperA = new IntWrapper(a);
        IntWrapper wrapperB = new IntWrapper(b);
        calculateInteger(wrapperA, wrapperB);
        System.out.println(wrapperA.value+" "+wrapperB.value);

    }
}