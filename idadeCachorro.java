//Muita gente diz que 1 ano de vida de um cachorro representa 7 anos de vida de um humano, baseado no ano de vida de um cachorro desenvolva um programa que conforme a idade de um cachorro retorne qual a idade humana que este cachorro teria.

package script;

import java.util.Scanner; // importando a Classe Scanner para o meu pacote

public class dog  // minha classe principal
{

	public static void main(String[] args) 
	{
		
		System.out.println("Informe a idade do seu cachorro: "); //instrução de impressão em tela

		//Criamos um objeto Scanner para capturar o que foi digitado		
		Scanner in = new Scanner(System.in); // instrução Scanner para armazenar na variável in o valor informado pelo usuário
		
		int idadeCachorro = in.nextInt(); // declarando uma variável inteira de nome "idadeCachorro" e posteriormente atribuindo o valor que foi lido através do que o usúario digitou em "in" via teclado e passando para "idadeCachorro"
		idadeCachorro = idadeCachorro * 7; // efetuando operação atribuindo o valor de "idadeCachorro" multiplicado por 7 para a variável "idadeCachorro que agora passa a ter novo valor.
		
		System.out.println("O seu cachorro tem: "+idadeCachorro+" anos."); // impressão em tela do resultado da operação efetuada anteriormente.
	}

}
