package exercicio04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] salariosAntes = new double[8];
        double[] salariosDepois = new double[8];
        double aumentoTotalFolha = 0;

        for (int i = 0; i < 8; i++) {
            System.out.print("Digite o salário do funcionário " + (i + 1) + ": R$ ");
            salariosAntes[i] = scanner.nextDouble();

            double aumento = salariosAntes[i] * 0.10;
            double novoSalario = salariosAntes[i] + aumento;

            if (novoSalario > 5000.00) {
                novoSalario = 5000.00;
                aumento = 5000.00 - salariosAntes[i];
                if (aumento < 0) aumento = 0; // Caso já ganhasse mais de 5000
            }

            salariosDepois[i] = novoSalario;
            aumentoTotalFolha += aumento;
        }

        System.out.println("\n--- RELATÓRIO DE REAJUSTE (TETO R$ 5000) ---");
        for (int i = 0; i < 8; i++) {
            System.out.printf("Funcionário %d | Antes: R$ %.2f | Depois: R$ %.2f\n",
                    (i + 1), salariosAntes[i], salariosDepois[i]);
        }
        System.out.printf("\nAumento total na folha de pagamento: R$ %.2f\n", aumentoTotalFolha);

        scanner.close();
    }
}
