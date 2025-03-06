import java.util.Scanner;

public class Main {
    public static boolean isPrimo(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;

        n = input.nextInt();

        System.out.println(isPrimo(n) ? n + " é primo" : n + " não é primo");
    }
}
