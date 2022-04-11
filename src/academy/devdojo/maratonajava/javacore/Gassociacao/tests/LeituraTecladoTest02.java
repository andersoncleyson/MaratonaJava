package academy.devdojo.maratonajava.javacore.Gassociacao.tests;

import java.util.Scanner;

public class LeituraTecladoTest02 {
    public static void main(String[] args) {
        System.out.println("Hello, friend");
        System.out.println("Are you ready for revolution?");

        Scanner input = new Scanner(System.in);
        String pergunta = input.nextLine();

        if(pergunta.charAt(0) == 'y'){
            System.out.println("We are FSOCIETY");
        } else {
            System.out.println("Goodbye");
        }
    }
}
