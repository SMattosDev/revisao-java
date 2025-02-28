
package etecuirapuru.com.br.main;

import java.util.Scanner;


public class Main {
    
    public static void main(String[] args) {
        
        Scanner lerOqueUsuarioDigita = new Scanner(System.in);
        String nomeUsuario;
        
        System.out.println("Digite seu nome: ");
         nomeUsuario = lerOqueUsuarioDigita.next();
         
        int rmAluno;
        
        System.out.println(" Digite seu RM: ");
        rmAluno = lerOqueUsuarioDigita.nextInt();
        
        String isQuerIrEmboraCedo;
        System.out.println(" Quer ir embora masi cedo?" + "(S - N)");
        isQuerIrEmboraCedo = lerOqueUsuarioDigita.next();
        
        if(isQuerIrEmboraCedo.toLowerCase().equals("s")){
            isQuerIrEmboraCedo = "Sim";
        }else{
            isQuerIrEmboraCedo = "Não";
        }
        
        System.out.println("");
        System.out.println("----- INFORMAÇÕES ALUNO -----");
        System.out.println("");
        System.out.println("Nome: " + nomeUsuario +
                            "\n RM: " +rmAluno + 
                "\nPretende sair cedo: " +isQuerIrEmboraCedo
        );
        System.out.println("");
        System.out.println("----- ----- -----");
        System.out.println("");
    
}}
