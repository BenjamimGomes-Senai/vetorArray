package exercicio07;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] nomes = new String[6];
        double[] vendas = new double[6];

        for (int i = 0; i < 6; i++) {
            System.out.print("Nome do vendedor " + (i + 1) + ": ");
            nomes[i] = scanner.next();
            System.out.print("Total de vendas de " + nomes[i] + ": R$ ");
            vendas[i] = scanner.nextDouble();
        }

        // Ordenação manual Bubble Sort (Do maior para o menor)
        // Usamos dois loops for aninhados para comparar os elementos vizinhos
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 5; j++) {
                // Se o elemento da esquerda for menor que o da direita, trocamos de lugar
                if (vendas[j] < vendas[j + 1]) {

                    // Troca as vendas usando uma variável temporária
                    double auxVenda = vendas[j];
                    vendas[j] = vendas[j + 1];
                    vendas[j + 1] = auxVenda;

                    // IMPORTANTE: Troca os nomes JUNTO para não misturar os dados
                    String auxNome = nomes[j];
                    nomes[j] = nomes[j + 1];
                    nomes[j + 1] = auxNome;
                }
            }
        }

        System.out.println("\n🏆 RANKING FINAL DE VENDAS 🏆");
        for (int i = 0; i < 6; i++) {
            System.out.println((i + 1) + "º Lugar: " + nomes[i] + " - R$ " + vendas[i]);
        }

        scanner.close();
    }
}
