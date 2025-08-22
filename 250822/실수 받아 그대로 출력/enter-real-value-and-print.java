import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        String formatted = String.format("%.2f", a);

        System.out.printf(formatted);
    }
}