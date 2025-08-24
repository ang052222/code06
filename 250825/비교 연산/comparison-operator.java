import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        int a, b;
        Scanner sc = new Scanner(System.in);

        a = sc.nextInt();
        b = sc.nextInt();

        
        System.out.println(a >= b ? 1 : 0);
        System.out.println(a > b ? 1 : 0);
        System.out.println(b >= a ? 1 : 0);
        System.out.println(b > a ? 1 : 0);
        System.out.println(a == b ? 1 : 0);
        System.out.println(a != b ? 1 : 0);
        
    }
}