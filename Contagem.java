import java.util.Scanner;

public class Main {
    public static int contar(int[] arr, int N) {
        int count = 0;
        for (int num : arr) {
            if (num >= arr[0] && num <= N) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o valor de N: ");
        int N = input.nextInt();
        int[] arr = {1, 2, 3, 4, 5, 6};
        System.out.println("Contagem de valores entre o primeiro dado e N: " + contar(arr, N));
    }
}
