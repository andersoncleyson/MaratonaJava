package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturaCondicionais01 {
    public static void main(String[] args){
        int idade = 17;
        boolean autorizadoComprarBebida = idade >= 18;

        if(autorizadoComprarBebida){
            System.out.println("Pode comprar");
        } else {
            System.out.println("Não pode");
        }
    }
}
