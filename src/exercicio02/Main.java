package exercicio02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] estoque = new int[10];
        int contadorCriticos = 0;

        // Lendo o estoque de 10 produtos
        for (int i = 0; i < 10; i++) {
            System.out.print("Quantidade em estoque do produto " + (i + 1) + ": ");
            estoque[i] = scanner.nextInt();

            // Se for menor que 5, conta como crítico
            if (estoque[i] < 5) {
                contadorCriticos++;
            }
        }

        System.out.println("\nQuantidade de produtos com estoque crítico: " + contadorCriticos);
        System.out.println("Posições (índices) dos produtos críticos:");

        // Loop para mostrar as posições de quem tem menos de 5 unidades
        for (int i = 0; i < 10; i++) {
            if (estoque[i] < 5) {
                System.out.println("Produto no índice [" + i + "] tem apenas " + estoque[i] + " unidades.");
            }
        }

        scanner.close();
    }
}
