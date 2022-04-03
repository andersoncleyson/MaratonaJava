package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salario;
    private double media = 0;

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.idade);

        if(salario != null){
            for (double i: this.salario){
                System.out.printf("R$" + i + "| ");
            }
        }

    }

    public void imprimeMedia(){
        if(salario == null){
            return;
        }

        double somaSalarios = 0;

        for (double salarios: this.salario){
            somaSalarios += salarios;
        }


        double media = somaSalarios / 3;
        System.out.printf("A média = %.2f", media);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSalario(double[] salario) {
        this.salario = salario;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double[] getSalario() {
        return salario;
    }

    public double getMedia() {
        return media;
    }
}
