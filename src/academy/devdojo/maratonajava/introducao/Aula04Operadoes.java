package academy.devdojo.maratonajava.introducao;

public class Aula04Operadoes {
    public static void main(String[] args){
        int numero1 = 12;
        int numero2 = 34;
        int soma = numero1 + numero2;

        System.out.println(soma);

        //%
        int resto = 21 % 2;
        System.out.println(resto);

        // < > <= >= == !=
        boolean isDezMaiorQueVinte = 10 >20;
        System.out.println(isDezMaiorQueVinte);

        boolean isDezIgualVinte = 10 == 20;
        System.out.println(isDezIgualVinte);

        // AND (&&) OR (||) !
        int idade = 26;
        float salario = 3000F;

        boolean isDentroDaLei = idade > 30 && salario > 4000;

        System.out.println("Dentro da lei " + isDentroDaLei);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 3400;
        float valorPlaystation = 5000;
        boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca > valorPlaystation;

        System.out.println("Da pra comprar? " + isPlaystationCincoCompravel);

        // = += -= *= /= %=
        double bonus = 1900;
        bonus += 1000;
        System.out.println(bonus);
    }
}
