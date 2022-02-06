
package loops.exercicios;

import java.util.Scanner;

/** Lista 3
 * Questao 2
 * @author VAIO
 */
public class Q2_SolicitacaoDeLogin {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        boolean valido = false;
        
        do{
            System.out.println("Digite um nome: ");
            String nome = scan.nextLine();
            
            System.out.println("Digite uma senha: ");
            String senha = scan.nextLine();
            
            if(nome.equalsIgnoreCase(senha)){
                System.out.println("ERRO! a senha não pode ser igual ao login!");
            }else{
                System.out.println("Senha e login validos!");
                valido = true;
            }
        }while(!valido);
    }
    
}
