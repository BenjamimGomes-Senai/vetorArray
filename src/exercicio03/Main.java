package exercicio03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Vetores paralelos com códigos e preços cadastrados (exemplo com 4 itens)
        int[] codigos = {10, 20, 30, 40};
        double[] precos = {5.50, 12.90, 84.00, 19.99};

        System.out.print("Digite o código do produto para buscar: ");
        int codigoProcurado = scanner.nextInt();

        // Variáveis de controle da busca
        boolean encontrado = false;
        int indiceEncontrado = -1;

        // Loop de busca linear no vetor de códigos
        for (int i = 0; i < codigos.length; i++) {
            if (codigos[i] == codigoProcurado) {
                encontrado = true;
                indiceEncontrado = i; // Guarda o índice onde achou
                break; // Interrompe o loop pois já achou
            }
        }

        // Se encontrou, pega o preço na MESMA posição (índice) do outro vetor
        if (encontrado == true) {
            System.out.println("Preço do produto: R$ " + precos[indiceEncontrado]);
        } else {
            System.out.println("Produto não cadastrado");
        }

        scanner.close();
    }
}
