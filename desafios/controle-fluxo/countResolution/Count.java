// Arquivo: Contador.java
package countResolution;

import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start;
        int end;

        System.out.println("Enter the start number: ");
        start = sc.nextInt();
        System.out.println("Enter the end number: ");
        end = sc.nextInt();

        try {
            InnerCount(start, end);
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage()); // Exibe a mensagem de erro
        }
        sc.close();
    }

    public static void InnerCount(int start, int end) throws ParametrosInvalidosException {
        if (end < start) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        } else {
            int count = end - start; // Correção aqui
            for (int i = 1; i <= count; i++) { // Loop corrigido
                System.out.println("Imprimindo o número " + i);
            }
        }
    }
}