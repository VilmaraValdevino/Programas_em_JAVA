// Calculadora com menu com as opções de escolher qual tipo de operação o usuário deseja, desenvolvida de forma simples apenas com estrutura If Else.

package script;

import java.util.Scanner; // Importando a classe Scanner para o meu pacote

public class calculadoraMenu {

	public static void main(String[] args) 
	{
			// Criando objeto para capturar o que for digitado
			Scanner in = new Scanner(System.in);
			
			// Menu de escolhas
			System.out.println("Escolha uma opção: \n1 - soma  2 - subtração \n3 - multiplicação  4 - divisão");
			int opcao = in.nextInt();
			
			
			// Se a opção digitada for 1 ...
			if ( opcao == 1 )
			{
				// Peça ao usuário um valor e armazene na variável num1
				System.out.println("Digite o primeiro número: ");
				double num1 = in.nextDouble();
				
				// Peça ao usuário um segundo valor e armazene na variável num2
				System.out.println("Digite o segundo número: ");
				double num2 = in.nextDouble();
				
				//imprima na tela o resultado da operação da soma
				System.out.println(num1 + num2);
			}
			// Senão se a opção digitada for 2 ...
			else if ( opcao == 2 )
			{
				// Peça ao usuário um valor e armazene na variável num1
				System.out.println("Digite o primeiro número: ");
				double num1 = in.nextDouble();
				
				// Peça ao usuário um segundo valor e armazene na variável num2
				System.out.println("Digite o segundo número: ");
				double num2 = in.nextDouble();
				
				//imprima na tela o resultado da operação da subração 
				System.out.println(num1 - num2);
			}
			// Senão se a opção digitada for 3 ...
			else if ( opcao == 3 )
			{
				// Peça ao usuário um valor e armazene na variável num1
				System.out.println("Digite o primeiro número: ");
				double num1 = in.nextDouble();
				
				// Peça ao usuário um segundo valor e armazene na variável num2 
				System.out.println("Digite o segundo número: ");
				double num2 = in.nextDouble();
				
				//imprima na tela o resultado da operação da multiplicação
				System.out.println(num1 * num2);
			}
			// Senão se a opção digitada for 4 ...
			else if ( opcao == 4 )
			{
				
				// Peça ao usuário um valor e armazene na variável num1
				System.out.println("Digite o primeiro número: ");
				double num1 = in.nextDouble();
				
				// Peça ao usuário um segundo valor e armazene na variável num2
				System.out.println("Digite o segundo número: ");
				double num2 = in.nextDouble();
				
				//imprima na tela o resultado da operação da divisão
				System.out.println(num1 / num2);
			}
			// Senão caso o usuário não digite nenhum valor válido...
			else
			{
				//Imprimir opção inválida.
				System.out.println("Opção inválida!!!");
			}		
	}

}
