package academy.devdojo.maratonajava.javacore.Gassociacao.tests;

import java.util.Scanner;

public class LeituraTecladoTest01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("OLHA QUE DIÁLAGO MERDA!");
        String next = entrada.nextLine();

        System.out.println(next);

        System.out.println("Quando aconteceu o hack?");
        int data = entrada.nextInt();
        System.out.println(data);
    }
}
