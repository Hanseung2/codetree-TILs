import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String command = sc.next();

            switch (command) {
                case "push_back":
                    int value = sc.nextInt();
                    arr.add(value);
                    break;
                case "get":
                    int index = sc.nextInt();
                    
                    if (index >= 1 && index <= arr.size()) {
                        System.out.println(arr.get(index - 1));
                    } else {
                        System.out.println("Error: Invalid index");
                    }
                    break;
                case "size":
                    System.out.println(arr.size());
                    break;
                case "pop_back":
                    if (!arr.isEmpty()) {
                        arr.remove(arr.size() - 1);
                    }
                    break;
                default:
                    System.out.println("Error: Unknown command");
                    break;
            }
        }
    }
}