package edu.giovanna.anatomiaclasses;

public class MyClass {
    public static void main(String[] args) {

        String primeiroNome = "Giovanna ";
        String segundoNome = "Messias";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);
    }

       public static String nomeCompleto (String primeiroNome, String segundoNome){
            return primeiroNome.concat("").concat(segundoNome);
        }

    }
