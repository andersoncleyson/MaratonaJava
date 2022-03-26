package academy.devdojo.maratonajava.introducao;

/**
 * Prática
 *
 * Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:
 *
 * Eu <nome>, morando no endereço <endereco>,
 * confirmo que recebi o salário de <salario>, na data <data>
 */

public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args){
        String nome = "Anderson";
        String endereco = "rua 14";
        float salario = 4000.56F;
        String dataRecebimento = "01/05/2022";

        System.out.println("Eu " + nome + " morando no endereço " + endereco + ",");
        System.out.println("confirmo que recebi o salário de " + salario + ", na data " + dataRecebimento);

    }
}
