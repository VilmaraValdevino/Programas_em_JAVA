//Calculadora Simples em Java

package script;

import java.util.Scanner;  // importando a Classe Scanner para o meu pacote

public class calculadora // minha classe principal
{

	public static void main(String[] args) 
	{
		//Criamos um objeto Scanner para capturar o que foi digitado
		Scanner in  = new Scanner(System.in);
		
		//declarando váriaveis do tipo real
		double num1, num2, soma, subtracao, multi, div;
		
		//impressão em tela
		System.out.println("Insira um número: ");
		//armazenando a variável
		num1 = in.nextDouble();
		
		//impressão em tela
		System.out.println("Insira outro número: ");
		//armazenando a variável
		num2 = in.nextDouble();
		
		//realizando operação matemática de soma
		soma = num1 + num2;
		System.out.println("O resultado da soma é: " +soma);
		
		//realizando operação matemática de subtração
		subtracao = num1 - num2;
		System.out.println("O resultado da subtração é: " +subtracao);
		
		//realizando operação matemática de multiplicação
		multi = num1 * num2;
		System.out.println("O resultado da multiplicação é: " +multi);
		
		//realizando operação matemática de divisão
		div = num1 / num2;
		System.out.println("O resultado da divisão é: " +div);
	}

}
