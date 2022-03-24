import java.util.Scanner;

public class KageBunshin {
    public static void qtdeKageBunshin() {
        Scanner scan = new Scanner(System.in);
        int N, K;
        System.out.println("\nHá quantos ninjas na sua frente? (Digite 0 para sair)");

        while (scan.hasNextInt()) {

            N = scan.nextInt();

            if (N == 1) K = 0;
            else if (N < 1) break;
            else K = N / 2;

            System.out.println(K);
        }
    }
}
