package academy.devdojo.maratonajava.javacore.Isobrescrita.dominio;

public class Anime extends Object{
    private String nome;

    @Override
    public String toString(){
        return this.nome;
    }

    public Anime(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
