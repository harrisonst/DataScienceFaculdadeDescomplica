//salvar como Prog07.java

import javax.swing.*;

class exemploEAtividadePratica16Video3de4 
{

  public static void soma () 
  {
    int s=0, vet [] = {1, 2, 3, 4, 5};

    for (int i = 0; i<vet.length; i++)
    { 
      s = s + vet [i];
    }
  
    JOptionPane.showMessageDialog(null, "A somatoria é "+ s);
  }

  public static int produto()
  {
    int p=1, vet [] = {1, 2, 3, 4, 5};
    for (int i = 0; i<vet.length; i++)
    {
      p = p * vet [i];
    }
    return p;
  }

  public static void main (String entrada [])
  {
    int r;

    soma ();
    r = produto();
    JOptionPane.showMessageDialog(null, "A produtoria é "+ r); 
    System.exit(0);
  }
}


