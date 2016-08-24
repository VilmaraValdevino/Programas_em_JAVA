//Crie um programa que mostre se o usuário já é maior de idade e a quantos anos, caso contrário quantos anos faltam.

package maioridade;

import javax.swing.JOptionPane;

public class maiorIdade 
{

    public static void main(String[] args) 
    {
        //declarando as variáveis do tipo string e inteira
        String idade;
        int idade2,maior,menor;
        
        
        //Nesta função estamos imprimindo na tela mensagem para o usuário digitar o que é solicitado na mensagem, e posteriormente esse dado digitado já é armazenado automaticamente na variável informada na função, que nesse caso seria a váriavel idade. 
        idade = JOptionPane.showInputDialog("digite sua idade: ");
        //A variável inteira "idade2" está recebendo um comando de conversão, onde está se pedindo para converter a variável solicitada para um tipo inteiro, que nesse caso a variável informada no metódo é a variável de string "idade" que está sendo convertida para um tipo inteiro e sendo atribuida à váriavel "idade2".
        idade2 = Integer.parseInt(idade);
        
        while(idade2>0)
        {
            //Se a variável "idade2" for maior ou igual à 18....
            if (idade2 >= 18)
            {
                //Imprimir na tela que o usuário é maior de idade
                System.out.println("Você é maior de idade !!!");
                //váriavel "maior" recebe o resultado de ("idade2" - 18)
                maior=(idade2-18);
                //Imprimir na tela há quantos anos o usuário já é maior de idade
                System.out.println("Já faz "+maior+" anos que você é maior de idade!!!");
            }
            else
            {
                //Imprimir na tela que o usuário é menor de idade
                System.out.println("Você ainda não é maior de idade!!!");
                //váriavel "menor" recebe o resultado de (18 - "idade2")
                menor=(18-idade2);
                //Imprimir na tela quantos anos faltam para o usuário já se tornar maior de idade
                System.out.println("Faltam "+menor+" anos para você se tornar maior de idade !!! ");
            }
            
            //
            idade = JOptionPane.showInputDialog("digite sua idade: ");
            idade2 = Integer.parseInt(idade);
        }
    }
    
}
