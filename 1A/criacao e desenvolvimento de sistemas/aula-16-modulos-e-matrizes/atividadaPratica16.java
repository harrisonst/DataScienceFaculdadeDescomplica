//minha resolução da atividade prática 16

import javax.swing.*;

public class atividadaPratica16 {
  
    //declaracao de variaveis
    int produtoria; 

    public static void soma(int vetor[]) 
    {
      int somatoria = 0;
    
      for (i = 0; i <= vetor[5].length; i++)
        {
          somatoria = Integer.parseInt(JOptionPane.showInputDialog(vetor[i]));    
        }
      //JOptionPane.showMessageDialog(null,"OI resultado da somatória é " + somatoria);
      return somatoria;
    }
    
    public static void produtoria(int vetor[]) {
      {
        int prodResult = 0;
      
        for (i = 0; i <= 5; i++)
          {
            prodResult = Integer.parseInt(JOptionPane.showInputDialog(vetor[i]));    
          }
  
        //JOptionPane.showMessageDialog(null,"OI resultado da somatória é " + produtoria);
      }
    }
    public static void main (String entrada[])
    {  
      soma();
      produtoria();
      JOptionPane.showMessageDialog("Resultado da produtoria é " + produtoria());
      System.exit(0);
    }
}
