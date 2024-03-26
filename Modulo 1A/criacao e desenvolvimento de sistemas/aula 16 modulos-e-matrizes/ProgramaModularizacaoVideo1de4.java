//salvar como ProgMod.java

import javax.swing.*;

class ProgramaModularizacaoVideo1de4
{
  /*aqui é o lugar para variáveis globais. Nesta ativade usaremos somente variáveis locais.*/

  // Método principal para iniciar a execução do programa
  public static void main(String[] args) {
    // Chamadas aos métodos para demonstrar suas funcionalidades
    soma();
    subtracao(10, 5);
    int resultadoProduto = produto();
    System.out.println("O produto é " + resultadoProduto);
    double resultadoDivisao = divisao(10, 2);
    System.out.println("A divisão é " + resultadoDivisao);
  }
  
  public static void soma () { //exemplo do uso de procedimento
    int n1, n2;
    n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
    n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número"));

    JOptionPane.showMessageDialog(null, "A soma é " + (n1 + n2));
  } 

  public static void subtracao(int x, int y) //exemplo do uso de procedimento
  {
    int s;
    s = x - y;
    JOptionPane.showMessageDialog(null, "A diferença é " + s);
  }

  public static int produto () //exemplo do uso de função
  {
    int n1, n2;
    n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
    n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número"));

    return (n1 * n2);
  }

  public static double divisao (int x, int y) //exemplo do uso de função
  {
    double d;
    d = (double)x / (double)y;
    return d; //utilizou retur para mostrar o retorno da funcao
  }
}
