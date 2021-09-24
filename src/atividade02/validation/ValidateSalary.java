package atividade02.validation;

public class ValidateSalary {

     public static boolean isSalary(Double value){
        boolean valido = true;
        if(value  <= 0){
            valido = false;
        }
        return valido;
    }
}