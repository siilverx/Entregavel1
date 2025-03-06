import java.util.Scanner;

public class Main {
    public static int somatorio(int n) {
        int soma = 0;
        for (int i = 1; i <= n; i++) {
            soma += i;
        }
        return soma;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;

        n = input.nextInt();

        System.out.println("Somatório de " + n + " é " + somatorio(n));
    }
}

