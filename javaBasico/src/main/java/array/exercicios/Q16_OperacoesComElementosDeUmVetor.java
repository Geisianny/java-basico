
package array.exercicios;

import java.util.Scanner;

/** Lista 4
 *  Questao 16
 * @author VAIO
 */
public class Q16_OperacoesComElementosDeUmVetor {

    public static void main(String[] args) {
        
       Scanner scan = new Scanner(System.in);
       int[] numeros = new int[10];
       
       for(int i = 0; i<10;i++){
           System.out.printf("Digite o %dº elemento:\n",(i+1));
           numeros[i] = scan.nextInt();
       }
       
       int somaMenor15 = 0;
       int contIgual15 = 0;
       float mediaMaior15 = 0;
       int contMaior15 = 0;
       
       for(int i = 0;i < 10; i++){
           if(numeros[i] < 15){
               somaMenor15 =+ numeros[i];
           }else if( numeros[i] == 15){
               contIgual15++;
           }else{
               mediaMaior15 += numeros[i];
               contMaior15++;
           }
       }
       
        mediaMaior15 = mediaMaior15/contMaior15;
       
        System.out.println("Soma de elementos menores que 15: " + somaMenor15);
        System.out.println("Quantidade de elementos iguais a 15: "+ contIgual15);
        System.out.println("Media de elementos maiores que 15: "+ mediaMaior15);
    }    
    
}
