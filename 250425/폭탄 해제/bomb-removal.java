import java.util.Scanner;

public class Main {
    static class Branch {
        private String name;
        private char color;
        private int second;

        public Branch(String name, char color, int second){
            this.name = name;
            this.color = color;
            this.second = second;
        }

        public String getName(){ return name;}
        public char getColor(){ return color;}
        public int getSecond(){ return second;}
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String uCode = sc.next();
        char lColor = sc.next().charAt(0);
        int time = sc.nextInt();
        
        Branch branch = new Branch(uCode,lColor,time);
        System.out.println("code : " + branch.getName());
        System.out.println("color : " + branch.getColor());
        System.out.println("second : " + branch.getSecond());
    }
}