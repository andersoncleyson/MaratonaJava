package academy.devdojo.maratonajava.javacore.Oexcecao.exception.test;

import academy.devdojo.maratonajava.javacore.Oexcecao.exception.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Oexcecao.exception.dominio.LoginInvalidoException;
import academy.devdojo.maratonajava.javacore.Oexcecao.exception.dominio.Pessoa;

public class SobrescritaComExceptionTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();

        try {
            funcionario.salvar();
        } catch (LoginInvalidoException e){
            e.printStackTrace();
        }
    }
}
