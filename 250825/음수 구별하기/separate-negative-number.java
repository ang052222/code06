import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(a);
        String result = "";
        if(a < 0){
            result = "minus";
        }
        System.out.println(result);
    }
}