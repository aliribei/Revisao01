package atividade02;
import java.util.Scanner;
import java.util.Locale;
import java.text.NumberFormat;

import atividade02.validation.ValidateSalary;

//_ Crie um programa em linguagem Java que solicita ao usuário que digite o salário,
// armazene em uma variável do tipo double e imprima uma mensagem caso 
//o salário seja maior que R$ 1997,58, outra mensagem se o salário for maior que R$5399,99 
//e outra mensagem se o salário digitado for menor ou igual a zero. 
//Caso o salário seja menor igual a zero o sistema deve solicitar que o usuário digite 
//o salário novamente para então realizar as validações de faixas salariais mais uma vez
// até que o usuário digite um valor acima de zero.


public class Atividade02 {

    private static Scanner sc;

    public static void main(String[] args) {

        Locale localeBR = new Locale("pt","BR");

        NumberFormat money  = NumberFormat.getCurrencyInstance(localeBR);
        
        sc = new Scanner(System.in);

        boolean isValida = true;

        Double salary;

         do {
            System.out.println("Digite o sálario do usuário: ");
            salary = Double.parseDouble(sc.nextLine());
            if ( salary > 1997.5 && salary <= 5399.99){
                System.out.println("O salario digitado -> " 
                + money.format(salary) + " é maior que R$ 1.997,57");
                break;
            } 
            else if ( salary > 5399.99){
                System.out.println("Sálario digitado -> " 
                +  money.format(salary) + " é  maior que  R$5.399,99");
                break;
            }
            else if (ValidateSalary.isSalary(salary) == true){
                System.out.println();
                break;
            } else{ System.out.println("Erro, o sálario digitado tem que ser maior do que 0 !!!");};
        }while (isValida);
     
    }
    
}
