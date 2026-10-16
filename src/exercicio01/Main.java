package exercicio01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criamos o vetor para guardar os 7 faturamentos
        double[] faturamento = new double[7];
        String[] dias = {"Domingo", "Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado"};

        double total = 0;
        double maiorVenda = 0;
        String diaMaiorVenda = "";

        // Loop para ler os dados
        for (int i = 0; i < 7; i++) {
            System.out.print("Faturamento de " + dias[i] + ": R$ ");
            faturamento[i] = scanner.nextDouble();

            // Soma o faturamento ao totalizer
            total = total + faturamento[i];

            // Se for o primeiro dia ou a venda atual for maior que a maior registrada
            if (i == 0 || faturamento[i] > maiorVenda) {
                maiorVenda = faturamento[i];
                diaMaiorVenda = dias[i];
            }
        }

        double media = total / 7;

        // Exibe os resultados na tela
        System.out.println("\n--- RESULTADOS ---");
        System.out.println("Total faturado: R$ " + total);
        System.out.println("Média diária: R$ " + media);
        System.out.println("Dia que mais vendeu: " + diaMaiorVenda + " (R$ " + maiorVenda + ")");

        scanner.close();
    }
}
