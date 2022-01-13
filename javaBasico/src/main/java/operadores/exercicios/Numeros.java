
package operadores.exercicios;

import java.util.Scanner;

/**
 * Questão 11
 * @author VAIO
 */
public class Numeros {

    public static void main(String[] args) {
       
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite um numero inteiro: ");
        int num1 = scan.nextInt();
        
        System.out.println("Digite outro numero inteiro: ");
        int num2 = scan.nextInt();
        
        System.out.println("Digite um numero real: ");
        float num3 = scan.nextFloat();
        
        double operacao1 = 0;
        double operacao2 = 0;
        double operacao3 = 0;
        
        
        operacao1 = (num1*num1) * (num2/2);
        operacao2 = (num1*num1*num1) + num3;
        operacao3 = num3*num3*num3;
        
        System.out.println("Operação 1: o produto do dobro do primeiro"
                + "com metade do segundo é: " + operacao1);
        System.out.println("Operação 2: a soma do triplo do primeiro com o"
                + " terceiro é: " + operacao2);
        System.out.println("Operação 3: o terceiro elevado ao cubo é: "+ operacao3);
        
        
    }
    
}
