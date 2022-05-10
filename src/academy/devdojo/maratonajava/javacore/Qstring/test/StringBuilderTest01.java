package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        String nome = "Elliot Alderson";
        nome.concat(" Mr Robot");
        nome = nome.substring(0,4);
        System.out.println(nome);

        StringBuilder sb = new StringBuilder("Elliot Alderson");
        sb.append(" Mr Robot");
        sb.reverse();
        System.out.println(sb);
    }
}
