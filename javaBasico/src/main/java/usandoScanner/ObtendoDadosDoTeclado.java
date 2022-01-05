
package usandoScanner;

import java.util.Scanner;

/**
 *
 * @author VAIO
 */
public class ObtendoDadosDoTeclado {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        /*System.out.println("Digite seu nome completo: ");
        String nomeCompleto = scan.nextLine();
        
        System.out.println("Seu nome completo é: "+ nomeCompleto);
        
        System.out.println("Digite seu primeiro nome: ");
        String primeiroNome = scan.next();
        System.out.println("Seu primeiro nome é: "+ primeiroNome);
        
    
        System.out.println("Digite a sua idade: ");
        int idade = scan.nextInt();
        System.out.println("Sua idade é: " + idade);
        
        System.out.println("Digte a sua altura: ");
        double altura = scan.nextDouble();
        System.out.println("A sua altura é: " + altura);
        */
        System.out.println("Digite o seu primeiro nome, idade, quantidade de contas, altura e se tem pet: ");
        String primeiroNome = scan.next();
        int idade = scan.nextInt();
        byte qtdContas = scan.nextByte();
        float altura = scan.nextFloat();
        boolean temPet = scan.nextBoolean();
        
        System.out.println("Você digitou os seguites valores: ");
        System.out.println("nome: " + primeiroNome);
        System.out.println("Contas: " + qtdContas);
        System.out.println("Altura: "+ altura);
        System.out.println("Pet: " + temPet);
    }  
    
    
}
