//Média escolar de um aluno

package script;

import java.util.Scanner; // importando a Classe Scanner para o meu pacote

public class mediaEscolar // minha classe principal 
{
	
	public static void main(String[] args)
	{
		//Criamos um objeto Scanner para capturar o que foi digitado
		Scanner in = new Scanner(System.in);
		
		//Declarando váriaveis do tipo real
		double nota1,nota2,nota3,nota4,soma;
		
		// imprimindo em tela instrução ao usuário para digitar um número e posteiormente a váriavel armazena o número.
		System.out.println("digite a sua nota: ");
		nota1 = in.nextDouble();
		
		// imprimindo em tela instrução ao usuário para digitar um número e posteiormente a váriavel armazena o número.
		System.out.println("digite a sua 2ª nota: ");
		nota2 = in.nextDouble();
		
		// imprimindo em tela instrução ao usuário para digitar um número e posteiormente a váriavel armazena o número.
		System.out.println("digite a sua 3ª nota: ");
		nota3 = in.nextDouble();
		
		// imprimindo em tela instrução ao usuário para digitar um número e posteiormente a váriavel armazena o número. 
		System.out.println("digite a sua 4ª nota: ");
		nota4 = in.nextDouble();
		
		// soma recebe a adição de todas as variáveis, posteriormente soma recebe soma dividido por 4.
		soma = nota1+nota2+nota3+nota4;
		soma = soma/4;
		
		// Se soma for maior ou igual à 7 faça...
		if(soma >= 7)
		{
			// Impressão em tela de que o aluno foi aprovado e sua respectiva média.
			System.out.println("Você foi aprovado, a sua média é: " +soma);
		}
		// Senão faça...
		else
		{
			// Impressão na tela de que o aluno foi reprovado e sua respectiva nota.
			System.out.println("Você foi reprovado, a sua média foi de: " +soma);
		}
	}
}
