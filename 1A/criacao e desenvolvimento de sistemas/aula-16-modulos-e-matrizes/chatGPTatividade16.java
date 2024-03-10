import javax.swing.*;

public class chatGPTatividade16 {

    public static int soma(int vetor[]) {
        int somatoria = 0;
        for (int i = 0; i < vetor.length; i++) {
            somatoria += vetor[i];
        }
        return somatoria;
    }

    public static int produtoria(int vetor[]) {
        int prodResult = 1;
        for (int i = 0; i < vetor.length; i++) {
            prodResult *= vetor[i];
        }
        return prodResult;
    }

    public static void main(String entrada[]) {
        int vetor[] = new int[5];
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o número " + (i + 1)));
        }
        
        int resultadoSoma = soma(vetor);
        JOptionPane.showMessageDialog(null, "Resultado da soma é " + resultadoSoma);

        int resultadoProdutoria = produtoria(vetor);
        JOptionPane.showMessageDialog(null, "Resultado da produtoria é " + resultadoProdutoria);

        System.exit(0);
    }
}
