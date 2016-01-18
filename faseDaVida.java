/* Dado as seguintes informações: 
 
Fase jovem = até os 17 anos 
Fase da meia idade = dos 18 aos 59 anos 
Fase idosa = à partir dos 60 anos

Desenvolva um programa que dado a idade de uma pessoa seja capaz de dizer em qual fase da vida está pessoa está ! */

package script;

import java.util.Scanner ; // importando a classe Scanner para o meu pacote.

public class faseDaVida 
{
	public static void main(String[] args)
	{
		//Criando objeto para capturar o que foi digitado
		Scanner in = new Scanner(System.in);
		
		//declarando constantes
		final int idadeJovem = 17, idadeIdoso = 60;
		
		// pedindo ao usuário que informe a idade e armazenando a mesma na variável idade
		System.out.println("Digite a idade: ");
		int idade = in.nextInt();
		
		// Se idade digitada for maior ou igual à 0 E menor ou igual à constante "idadeJovem" a condição é verdadeira e imprimirá em tela a informação de que é a idade de um jovem...
		if ( idade >= 0 && idade <= idadeJovem )
		{
			System.out.println("A idade informada é de um jovem!");
		}
		// Senão se a idade digitada for maior que a constante "idadeJovem" E menor que a constante "idadeIdoso" a condição é verdadeira e imprimirá na tela que a idade é de uma pessoa de meia idade...
		else if ( idade > idadeJovem && idade < idadeIdoso )
		{
			System.out.println("A idade informada é de uma pessoa de meia idade!");
		}
		// Senão se a idade digitada for maior ou igual à constante "idadeIdoso" imprimirá na tela a informação de que a idade é de um idoso...
		else if ( idade >= idadeIdoso)
		{
			System.out.println("A idade informada é de um idoso!");
		}
		// Senão acso o usuário digite um número fora das possibilidades , abaixo de 0 , ou seja a pessoa ainda não nasceu , imprimir na tela opção inválida !!...
		else
		{
			System.out.println("Opção inválida!!!");
		}
	}
}
