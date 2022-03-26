package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class ImprimirEstudante {
    public void imprime(Estudante estudante){
        System.out.println("============");

        System.out.println(estudante.nome + " " + estudante.idade + " " + estudante.sexo);
        estudante.nome = "GOhan";
    }
}
