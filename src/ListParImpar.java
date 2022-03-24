import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ListParImpar {

    public static void printList() {
        int numLines = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Quantos números serão informados? ");
        try {
            numLines = scan.nextInt();
        } catch (Exception e){

            printList();
        }

        ArrayList<Integer> entrada = new ArrayList<>();
        ArrayList<Integer> pares = new ArrayList<>();
        ArrayList<Integer> impares = new ArrayList<>();

        for (int i = 0; i < numLines; i++) {
            System.out.printf("Informe o %dº número:", i+1);
            try {
                int N = scan.nextInt();

                entrada.add(N);

                if (entrada.get(i) % 2 == 0) {

                    pares.add(entrada.get(i));

                } else {

                    impares.add(entrada.get(i));

                }
            } catch (Exception e){
                break;
            }

        }

        Collections.sort(pares);
        Collections.sort(impares);

        Collections.reverse(impares);

        for (int par : pares) {

            System.out.println(par);

        }

        for (int impar : impares) {

            System.out.println(impar);

        }


    }
}
