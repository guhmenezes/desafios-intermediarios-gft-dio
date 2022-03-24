import java.util.Scanner;

public class RodaDesafios {
    public static void main(String[] args) {
        System.out.println("\nDesafios Intermediários GFT QA#1");

        System.out.println("""
                
                1- Ordenando números pares e ímpares
                Pares em ordem crescente
                Impares em ordem decrescente
                """);
        ListParImpar.printList();

        System.out.println("""

                2- Há N ninjas diante de você, mas ao invés de contá-los usando seus reflexos,
                Vamos calcular quantas vezes o Kage Bunshin foi utilizado.""");
        KageBunshin.qtdeKageBunshin();

        System.out.println("\n3- Combinando Strings\n");
        CombinaNomes.combinar();

        while (true){
            System.out.println("""

                    Rodar Desafio novamente?
                    1 - Ordenando números pares e ímpares
                    2 - Kage Bunshin
                    3 - Combinando Strings
                    """);

        Scanner scan = new Scanner(System.in);
        int repeat;

        try {
            repeat = scan.nextInt();
        } catch (Exception e) {
            System.exit(0);
            break;
        }

            switch (repeat) {
                case 1 -> ListParImpar.printList();
                case 2 -> KageBunshin.qtdeKageBunshin();
                case 3 -> CombinaNomes.combinar();
                default -> System.exit(0);
            }
    }

    }
}
