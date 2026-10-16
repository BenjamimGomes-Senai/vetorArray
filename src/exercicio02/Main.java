package exercicio02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] estoque = new int[10];
        int criticos = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o estoque do produto " + (i + 1) + ": ");
            estoque[i] = scanner.nextInt();
            if (estoque[i] < 5) {
                criticos++;
            }
        }

        System.out.println("\n--- PRODUTOS EM ESTOQUE CRÍTICO (< 5 unidades) ---");
        System.out.println("Total de produtos críticos: " + criticos);

        for (int i = 0; i < 10; i++) {
            if (estoque[i] < 5) {
                System.out.println("Produto na Posição [Vetor índice " + i + "] -> Estoque: " + estoque[i]);
            }
        }

        scanner.close();
    }
}
