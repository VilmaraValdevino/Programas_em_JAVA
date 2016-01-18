// Programa para calcular à distância que o som vai percorrer num determinado espaço de tempo

package script;

import java.util.Scanner; // importando a classe scanner para o meu pacote

public class veloxSom 
{
	public static void main(String[] args)
	{
	  // Criando objeto para capturar o que for digitado.
		Scanner in = new Scanner(System.in);
		
		// declarando uma constante
		final double velocidadeSom = 340.28; //  " 340.28 m/s" metros por segundo
		
		// Impressão na tela informando ao usuário para digitar o espaço de tempo e posteriormente aramazenando na variável tempo
		System.out.println("Digite o espaço de tempo: ");
		int tempo = in.nextInt();
		
		// Impressão na tela da distância percorrida em metros e em KM.
		System.out.println("A distância seria de: " + tempo * velocidadeSom +  " metros percorridos.");
		System.out.println("A distância em km seria de: " + (tempo * velocidadeSom) / 1000 +  " km percorridos.");
	}
}
