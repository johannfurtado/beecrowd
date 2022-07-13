/*
 QUESTÃO
 Leia 3 valores, no caso, variáveis A, B e C, que são as três notas de 
 um aluno. A seguir, calcule a média do aluno, sabendo que a nota A tem 
 peso 2, a nota B tem peso 3 e a nota C tem peso 5. Considere que cada 
 nota pode ir de 0 até 10.0, sempre com uma casa decimal.
 ENTRADA
 O arquivo de entrada contém 3 valores com uma casa decimal, de dupla precisão (double).
 SAÍDA
 Imprima a variável MEDIA conforme exemplo abaixo, com 1 dígito após o 
 ponto decimal e com um espaço em branco antes e depois da igualdade. 
 Assim como todos os problemas, não esqueça de imprimir o fim de linha 
 após o resultado, caso contrário, você receberá "Presentation Error".
*/

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		double a = ler.nextDouble();
		double b = ler.nextDouble();
		double c = ler.nextDouble();

		double media = ((a*2) + (b*3) + (c*5))/10;
		
		System.out.println(String.format("MEDIA = %.1f" , media));
	}
}
