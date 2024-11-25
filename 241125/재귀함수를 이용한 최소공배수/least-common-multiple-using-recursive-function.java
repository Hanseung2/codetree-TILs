import java.util.Scanner;

public class Main {
    
    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public static int lcm(int a, int b) {
        return Math.abs(a * b) / gcd(a, b);
    }
    
    public static int findLcmRecursive(int[] numbers, int idx) {
        if (idx == numbers.length - 1) { 
            return numbers[idx];
        }
        return lcm(numbers[idx], findLcmRecursive(numbers, idx + 1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] numbers = new int[n];
        
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
        
        int result = findLcmRecursive(numbers, 0);
        System.out.println(result);

        sc.close();
    }
}