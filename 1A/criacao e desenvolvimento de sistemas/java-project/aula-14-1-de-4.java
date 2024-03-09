//salvar como Programa01.java

class Programa01
{
	public static void main (String entrada[])
	{
		//declaração de variáveis
		int NumInt;
		double NumReal, soma;
		char caracter;
		
		//entrada de dados		
		NumInt = Integer.parseInt(entrada[0]);
		NumReal = Double.parseDouble(entrada[1]);
		Caracter = (entrada[2]).chartAt(0);
		//processamento
		soma = (double)NumInt + NumReal;
		//saida de resultados
		System.out.println((double)NumInt + " + " + NumReal + " = " + soma + " sinal " + caracter);
		
		System.exit(0);
	}
}
