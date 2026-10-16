package exercicio05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Vetor de frequências: o índice do vetor representa a própria nota (0 a 10)
        int[] frequenciaNotas = new int[11];

        System.out.println("Insira a nota de 10 clientes (de 0 a 10):");
        for (int i = 0; i < 10; i++) {
            System.out.print("Cliente " + (i + 1) + ": ");
            int nota = scanner.nextInt();

            // Incrementa a posição correspondente à nota digitada
            frequenciaNotas[nota] = frequenciaNotas[nota] + 1;
        }

        int notaMaisVotada = 0;
        int maiorQuantidadeVotos = -1;

        System.out.println("\n--- CONTAGEM DE VOTOS ---");
        for (int i = 0; i <= 10; i++) {
            System.out.println("Nota " + i + " apareceu: " + frequenciaNotas[i] + " vez(es)");

            // Verifica qual nota teve a maior frequência
            if (frequenciaNotas[i] > maiorQuantidadeVotos) {
                maiorQuantidadeVotos = frequenciaNotas[i];
                notaMaisVotada = i;
            }
        }

        System.out.println("\nA nota mais votada foi a nota [" + notaMaisVotada + "] com " + maiorQuantidadeVotos + " votos.");
        scanner.close();
    }
}
