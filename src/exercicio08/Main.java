package exercicio08;

public class Main {
    public static void main(String[] args) {
        // Duas filiais enviaram dados que JÁ estão ordenados
        double[] filialA = {10.0, 30.0, 50.0};
        double[] filialB = {20.0, 40.0, 60.0, 70.0};

        // Vetor final deve ter o tamanho exato da soma das duas listas
        double[] relatorioFinal = new double[filialA.length + filialB.length];

        int i = 0; // Ponteiro (índice) para andar na filialA
        int j = 0; // Ponteiro (índice) para andar na filialB
        int k = 0; // Ponteiro (índice) para o relatorioFinal

        // Loop enquanto as duas listas ainda tiverem números para comparar
        while (i < filialA.length && j < filialB.length) {
            if (filialA[i] < filialB[j]) {
                relatorioFinal[k] = filialA[i];
                i++; // Avança na filial A
            } else {
                relatorioFinal[k] = filialB[j];
                j++; // Avança na filial B
            }
            k++; // Avança sempre na lista final
        }

        // Se sobrou algum número na filialA, joga direto pro final da lista unificada
        while (i < filialA.length) {
            relatorioFinal[k] = filialA[i];
            i++;
            k++;
        }

        // Se sobrou algum número na filialB, joga direto pro final da lista unificada
        while (j < filialB.length) {
            relatorioFinal[k] = filialB[j];
            j++;
            k++;
        }

        System.out.println("--- RELATÓRIO JUNTADO E ORDENADO ---");
        for (int index = 0; index < relatorioFinal.length; index++) {
            System.out.println("Posição " + (index + 1) + ": " + relatorioFinal[index]);
        }
    }
}
