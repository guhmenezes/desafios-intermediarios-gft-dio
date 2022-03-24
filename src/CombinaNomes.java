import java.util.Scanner;

public class CombinaNomes {

    public static void combinar(){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Quantas combinações?");
        int N = leitor.nextInt();
        String word1, word2, resultado = "";
        String[] array1, array2;
        for (int i = 0; i < N; i++) {
            System.out.printf("\n%d. Informe os dois nomes:\n",i+1);
            word1 = leitor.next();
            array1 = word1.split("");
            word2 = leitor.next();
            array2 = word2.split("");

            if ( array1.length >= array2.length ) {
                for (int j = 0; j < array1.length; j++){
                    try {
                        resultado += array1[j] + array2[j];
                    } catch (Exception e) {
                        resultado += array1[j];
                    }
                }
            } else {
                for (int j = 0; j < array2.length; j++){
                    try {
                        resultado += array1[j] + array2[j];
                    } catch (Exception e) {
                        resultado += array2[j];
                    }
                }


            }

            System.out.println(resultado);
            resultado = "";
        }
    }
}
