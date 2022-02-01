
package loops.exercicios;

import java.util.Scanner;

/** Lista 3
 * Questao 20
 * @author VAIO
 */
public class Q20_IdadesDeNpessoas {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite a quantidade de pessoas: ");
        int quantPessoas = scan.nextInt();
        
        float soma = 0;
        float media = 0;
        
        System.out.println("Digite as idades: ");
        for(int i = 0; i< quantPessoas; i++){
            
            int idade = scan.nextInt();
            soma += idade;
            
        }
        
        media = soma / quantPessoas;
        
        System.out.println("A soma das idades é: " + soma);
        System.out.println("A media das idades é: " + media);
        
        if(media >= 0 && media <= 25){
            System.out.println("Turma jovem!");
        }else if(media>= 26 && media<= 60){
            System.out.println("Turma adulta!");
        }else{
            System.out.println("Turma idosa!");
        }
        
        
    }
    
}
