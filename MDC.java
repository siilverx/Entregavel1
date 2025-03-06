import java.util.Scanner;

public class Main {
    public static int mdc(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b;
        
        a = input.nextInt();
        b = input.nextInt();


        System.out.println("MDC de " + a + " e " + b + " é " + mdc(a, b));
    }
}
