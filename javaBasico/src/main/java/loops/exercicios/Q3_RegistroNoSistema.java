
package loops.exercicios;

import java.util.Scanner;

/** Lista 3
 * Questao 3
 * @author VAIO
 */
public class Q3_RegistroNoSistema {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        boolean valido = false;
        String nome = null;
        
        int idade = 0;
        float salario;
        String sexo;
        String estado;
        
        do{
            System.out.println("Digite um nome: ");
            nome = scan.nextLine();
            
            if(nome.length()>= 3){
                valido = true;
            }else{
                System.out.println("Nome precisa no mínimo 3 caracteres.");
            }
        }while(!valido);
        
        valido = false;
        
        do{
            System.out.println("Digite a idade entre 0 e 150: ");
            idade = scan.nextInt();
            
            if(idade >= 0 && idade <= 150){
                valido = true;
            }else{
                System.out.println("Idade invalida! a idade teve ser entre 0"
                        + " e 150.");
            }
        }while(!valido);
        
        valido = false;
        
        do{
            System.out.println("Digite o salario (maior que 0):  ");
            salario = scan.nextFloat();
            
            if(salario > 0){
                valido = true;
            }else{
                System.out.println("salario invalido! o salario teve ser maior "
                        + "que 0.");
            }
        }while(!valido);
        
        valido = false;
        
        do{
            System.out.println("Digite o sexo binario(f ou m): ");
            sexo = scan.next();
        
            if(sexo.equalsIgnoreCase("f") || sexo.equalsIgnoreCase("m")){
                valido = true;
            }else{
                System.out.println("sexo binario invalido! digite um sexo "
                        + "binario f ou m");
            }
        }while(!valido);
        
        valido = false;
        
        do{
            System.out.println("Digite o estado civil(s/v/c/d): ");
            estado = scan.next();
            
            if(estado.equalsIgnoreCase("s") || estado.equalsIgnoreCase("c") ||
                    estado.equalsIgnoreCase("v") || estado.equalsIgnoreCase("d")){
                valido = true;
            }else{
                System.out.println("estado civil invalido! o estado civil deve "
                        + "ser s, v, c ou d."); 
            }
        }while(!valido);
        
        System.out.println("Dados: ");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salario: " + salario);
        System.out.println("Sexo binairo: " + sexo);
        System.out.println("Estado civil: "+ estado);
    }   
    
    
}
