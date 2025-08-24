import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        int a, b, c;
        Scanner sc = new Scanner(System.in);

        a = sc.nextInt();
        b = sc.nextInt();
        c = a + b;
        System.out.print(c + " " + (c / 2.0));
    }
}