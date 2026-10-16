package exercicio06;

public class Main {
    public static void main(String[] args) {
        // Dados de teste criados diretamente para simular o exercício de forma limpa
        int[] senhas = {101, 102, 103, 104, 105, 106, 107, 108, 109, 110};
        int[] ehIdoso = {0,   1,   0,   0,   1,   0,   1,   0,   0,   0}; // 1 significa idoso, 0 normal

        // Simulação de 3 atendimentos solicitada pelo enunciado
        for (int atendimento = 1; atendimento <= 3; atendimento++) {
            int indiceAtendido = -1;

            // Passo 1: Procurar o primeiro IDOSO (percorrendo o vetor)
            for (int i = 0; i < 10; i++) {
                if (senhas[i] != 0 && ehIdoso[i] == 1) {
                    indiceAtendido = i;
                    break; // Achou o primeiro idoso da fila, para a busca
                }
            }

            // Passo 2: Se não achou idoso, pega a primeira senha normal que não seja vazia (0)
            if (indiceAtendido == -1) {
                for (int i = 0; i < 10; i++) {
                    if (senhas[i] != 0) {
                        indiceAtendido = i;
                        break;
                    }
                }
            }

            // Realizando o atendimento e arrumando a fila
            if (indiceAtendido != -1) {
                System.out.println("📢 Atendimento #" + atendimento + " -> Senha chamada: " + senhas[indiceAtendido]);

                // Passo 3: Quem está atrás anda uma posição para frente
                for (int j = indiceAtendido; j < 9; j++) {
                    senhas[j] = senhas[j + 1];
                    ehIdoso[j] = ehIdoso[j + 1];
                }

                // Passo 4: A última posição da fila fica zerada (vazia)
                senhas[9] = 0;
                ehIdoso[9] = 0;

            } else {
                System.out.println("Fila vazia!");
            }

            // Mostrando o estado da fila após o atendimento
            System.out.print("Fila restante: [ ");
            for (int i = 0; i < 10; i++) {
                System.out.print(senhas[i] + " ");
            }
            System.out.println("]\n-----------------------------------");
        }
    }
}
