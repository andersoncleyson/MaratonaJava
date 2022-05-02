package academy.devdojo.maratonajava.javacore.Oexcecao.exception.test;

import academy.devdojo.maratonajava.javacore.Oexcecao.exception.dominio.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalideExceptionTest01 {
    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoException e){
            e.printStackTrace();
        }
    }

    private static void logar() throws LoginInvalidoException{
        Scanner teclado = new Scanner(System.in);
        String usernameDB = "Naruto";
        String senhaDB = "kurama";

        System.out.println("Usuário");
        String usernameDigitado = teclado.nextLine();
        System.out.println("Senha");
        String senhaDigitada = teclado.nextLine();

        if(!usernameDB.equals(usernameDigitado) || !senhaDB.equals((senhaDigitada))){
            throw new LoginInvalidoException("Usuário ou senha inválidos");
        }

        System.out.println("Usuário logado com sucesso");
    }
}
