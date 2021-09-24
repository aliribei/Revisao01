package atividade01;
import java.util.Scanner;
//_ Crie um programa em linguagem Java que solicita ao usuário que digite a idade, 
//armazene em uma variável do tipo byte e 
//imprima uma mensagem para idade maior que 25 anos, 
//outra mensagem para idade menor que 25 e uma outra mensagem se idade igual a 25 anos.

public class Atividade01 {


    private static Scanner sc;

    public static void main(String[] args) {
        
        sc = new Scanner(System.in);

        Byte age;
      
        System.out.println("Digite a idade do usuário: ");
        age = Byte.parseByte(sc.nextLine());
        if ( age > 25){
            System.out.println("A idade " + age + " é maior que 25!");
    
        } else if ( age == 25){
            System.out.println("Idade digitada é igual á 25!");
    
        }else{ 
            System.out.printf("Idade %d é menor que 25!!!\n", age);
    
        };
     
    }
}

