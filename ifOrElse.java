//Programa básico de tomada de decisão

package script;

import java.util.Scanner; // importando a Classe Scanner para o meu pacote

public class IfOrElse // minha classe principal
{

	public static void main(String[] args) 
	{
		//Criamos um objeto Scanner para capturar o que foi digitado
		Scanner in = new Scanner(System.in);
		
		//declaração de variável
		int num;
		
		//instrução de impressão em tela solicitando um número positivo até 10
		System.out.println("Digite um número positivo até 10: ");
		//armazenamento do que o usuário digitou
		num = in.nextInt();
		
		//Se o número digitado for menor ou igual à 10 E maior ou igual à 0 então faça...
		if(num<=10 && num>=0)
		{
			//impressão na tela do número digitado
			System.out.println("O número digitado foi: " +num);
		}
		//Senão, faça...
		else 
		{
			//Impressão em tela com mensagem de erro...
			System.out.println("Número inválido!!!");
		}

	}

}
