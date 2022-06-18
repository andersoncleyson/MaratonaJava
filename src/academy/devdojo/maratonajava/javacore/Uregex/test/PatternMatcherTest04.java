package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest04 {
    public static void main(String[] args){
        // \d = Todos os digitos
        // \D = Tudo o que não for digito
        // \s = Espaços em branco \t \n \f \r
        // \S = Todos os caracters excluindo os brancos
        // \w = a-z A-Z, digitos, _
        // \W = Tudo o que não for incluso no \w
        // []
        // ? Zero ou uma
        // * Zero ou mais
        // + uma ou mais
        // {n,m} de n ate m
        // ()
        // | o(v|c)o ovo | oco
        // $ fim da linha
        // . 1.3 = 123. 133. 1@3, 1A3

        //String regex = "[a-zA-C]";
        //String texto = "abaaba";

        String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+";
        String texto2 = "samS3pi0l@protonmail.com, 123jotaro@gmail.com.br, #@!zoro@mail.br, teste@gmail.com, sakura@mail ";
        System.out.println("Email valido");
        System.out.println("zoro@mail.br".matches(regex));
        System.out.println(texto2.split(",")[1].trim());
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto2);
        System.out.println("texto: "+ texto2);
        System.out.println("indice: 0123456789");
        System.out.println("regex "+ regex);
        System.out.println("Posições encontradas");

        while (matcher.find()){
            System.out.print(matcher.start()+ " " + matcher.group() + "\n");
        }

    }
}
