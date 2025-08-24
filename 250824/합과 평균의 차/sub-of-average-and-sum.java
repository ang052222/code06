import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        int a,b,c,d;
        Scanner sc = new Scanner(System.in);

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = a+b+c;

        System.out.println(d);
        System.out.println(d/3);
        System.out.println(d - (d/3));
    }
}