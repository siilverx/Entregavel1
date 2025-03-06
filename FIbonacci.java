
import java.util.Scanner;

public class Main {

    public static void exibirFibonacci(int n) {
        int a = 0, b = 1;
        System.out.print(a + " " + b + " ");
        for (int i = 2; i < n; i++) {
            int temp = a + b;
            System.out.print(temp + " ");
            a = b;
            b = temp;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o valor de N para gerar a sequência de Fibonacci: ");
        int n = input.nextInt();
        System.out.print("Sequência de Fibonacci até o " + n + "º termo: ");
        exibirFibonacci(n);
    }
}
