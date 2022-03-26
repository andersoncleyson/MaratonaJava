package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salario;

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

}
