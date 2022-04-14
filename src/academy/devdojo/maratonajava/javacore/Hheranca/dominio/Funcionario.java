package academy.devdojo.maratonajava.javacore.Hheranca.dominio;

public class Funcionario extends Pessoa{
    private double salario;

    static {
        System.out.println("Dentro do bloco estático de pessoa");
    }
    {
        System.out.println("Dentro do bloco de inicuialização de funcionario 1");
    }

    {
        System.out.println("Dentro do bloco de inicuialização de funcionario 2");
    }

    public Funcionario(String nome) {
        super(nome);
        System.out.println("Dentro do constructor funcionário");
    }
    //Protect vai dar acesso direto à variável, às todas as subclasses independentes
    //de onde estiverem, porém todas as classes que tiverem no mesmo pacote também vão ter acesso


    public void imprime(){
        super.imprime();
        System.out.println(this.salario);
    }

    public void relatorioPagamento(){
        System.out.println("Eu " + this.nome + " recebi o salario de " + this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
