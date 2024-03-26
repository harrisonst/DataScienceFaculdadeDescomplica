//programa AtividadePratica14.java
import javax.swing.*;

public class atividadePratica14 
{
    public static void main (String entrada[]) {
    //declaração de variáveis
    int n1, n2;
    double quo, pot;
    String msg = "";
x

    //entrada de dados
    n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro"));
    n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número"));

    //processamento3
    quo = (double)n1 / (double)n2;
    pot = Math.pow(n1, n2);

    //saída de dados
    msg = msg + "o quociente entre os dois números é " + quo + "\n";
    msg = msg + "a potência do primeiro número pelo segundo é " + pot + "\n";
    JOptionPane.showMessageDialog(null, msg);

    System.exit(0);
  }
}
