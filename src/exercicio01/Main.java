package exercicio01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] faturamento = new double[7];
        String[] dias = {"Domingo", "Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado"};

        double total = 0;
        double maiorVenda = -1;
        int diaMaiorVenda = 0;

        for (int i = 0; i < 7; i++) {
            System.out.print("Digite o faturamento de " + dias[i] + ": R$ ");
            faturamento[i] = scanner.nextDouble();
            total += faturamento[i];

            if (faturamento[i] > maiorVenda) {
                maiorVenda = faturamento[i];
                diaMaiorVenda = i;
            }
        }

        double media = total / 7;

        System.out.println("\n--- RESULTADO VENDAS DA SEMANA ---");
        System.out.printf("Total faturado: R$ %.2f\n", total);
        System.out.printf("Média diária: R$ %.2f\n", media);
        System.out.printf("Dia que mais vendeu: %s (R$ %.2f)\n", dias[diaMaiorVenda], maiorVenda);

        scanner.close();
    }
}
