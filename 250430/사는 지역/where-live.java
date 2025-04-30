import java.util.Scanner;

class Person{
    private String name;
    private String address;
    private String region;

    public Person(String name, String address, String region){
        this.name = name;
        this.address = address;
        this.region = region;
    }

    public String getName() {return name;}
    public String getAddress() {return address;}
    public String getRegion() {return region;}
}
public class Main {
    public static final int MAX_N = 10;

    public static Person[] person = new Person[MAX_N];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            String address = sc.next();
            String region = sc.next();

            person[i] = new Person(name,address,region);
        }

        int index = 0;
        for (int i = 1; i < n; i++){
            if(person[i].getName().compareTo(person[index].getName()) > 0)
                index = i;
        }

        System.out.println("name " + person[index].getName());
        System.out.println("addr " + person[index].getAddress());
        System.out.println("city " + person[index].getRegion());
    }
}