import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String id2 = sc.next();
        int code2 = sc.nextInt();
        
        Goods goods_1 = new Goods();
        goods_1.setName("codetree");
        goods_1.setCode(50);
        Goods goods_2 = new Goods();
        goods_2.setName(id2);
        goods_2.setCode(code2);

        System.out.printf("product %d is %s%n",goods_1.getCode(),goods_1.getName());
        System.out.printf("product %d is %s%n",goods_2.getCode(),goods_2.getName());
    }
    
    static class Goods{
        private String name;
        private int code;

        public Goods(){
        }

        public String getName(){return name;}
        public void setName(String name){this.name = name;}

        public int getCode(){return code;}
        public void setCode(int code){this.code = code;}
    }
}