package UsandoSwitchCase.exercicios;

import java.util.Scanner;

/** Lista 2
 * Questao 15
 * @author VAIO
 */
public class ClassificacaoDeTriangulos {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe tres lados do triangulo: ");
        float lado1 = scan.nextInt();
        float lado2 = scan.nextInt();
        float lado3 = scan.nextInt();
        
        String tipo = null;
        
        if((lado1+lado2) > lado3  && (lado3+lado2) > lado1 && (lado1+lado3) > 
                lado2 ){
            if(lado1 == lado2 && lado1 == lado3 && lado2 == lado3){
                tipo = "Triangulo Equilátero";
            }else if(lado1 != lado2 && lado1 != lado3 && lado2 != lado3 ){
                tipo = "Triangulo Escaleno";
            }else{
                tipo = "Triangulo Isósceles";
            }
            
        }
        
        if(tipo == null){
            System.out.println("Não é um triangulo!");
        }else{
            System.out.println("O tipo do triangulo é: " + tipo);
        }
                
    }
    

}
