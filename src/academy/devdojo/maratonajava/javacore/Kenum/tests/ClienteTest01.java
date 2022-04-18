package academy.devdojo.maratonajava.javacore.Kenum.tests;

import academy.devdojo.maratonajava.javacore.Kenum.dominio.Cliente;
import academy.devdojo.maratonajava.javacore.Kenum.dominio.TipoCliente;

public class ClienteTest01 {
    public static void main(String[] args) {
        //Inconsistência de dados
        Cliente cliente1 = new Cliente("Naruto", TipoCliente.PESSOA_FISICA);
        Cliente cliente2 = new Cliente("Naruto", TipoCliente.PESSOA_JURIDICA);
        Cliente cliente3 = new Cliente("Naruto", TipoCliente.PESSOA_FISICA);
        Cliente cliente4 = new Cliente("Naruto", TipoCliente.PESSOA_FISICA);

        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(cliente3);
        System.out.println(cliente4);
    }
}
