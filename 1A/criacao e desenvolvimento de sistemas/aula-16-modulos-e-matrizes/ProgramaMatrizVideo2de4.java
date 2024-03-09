//salvar como ProgMatriz.java
import javax.swing.*;

/**
 * ProgramaMatriz
 */
public class ProgramaMatrizVideo2de4
{
  public static void main(String entrada[]) 
  {
    int vetor[] = {2, 4, 6, 8, 10}; //possui apenas um par de colchetes porque vetor possui uma única dimensão
    int matriz[] [] = new int [2] [3]; //matriz tem dois colchetes indicando que possui duas dimensões. new int [2]=duas linhas, [3]=três colunas
    String msg = "vetor = ";
    
    //vetor = ;
    for (int i = 0; i < vetor.length; i++)
    {
      msg = msg + vetor[i] + " ";
    }
    JOptionPane.showMessageDialog(null, msg);
  

    msg = "Matriz = \n\n";
    for (int i = 0; i < matriz.length; i++) //este for percorre as linhas
    {
        for (int j = 0; j < matriz[0].length; j++) //este for percorre as colunas
        {
            matriz[i] [j] = Integer.parseInt(JOptionPane.showInputDialog("Digite um inteiro para posição " + i + " e " + j));
            msg = msg + matriz[i] [j] + " ";
        }
        msg = msg + "\n";
    }

    JOptionPane.showMessageDialog(null, msg);
    System.exit(0);
  }
}