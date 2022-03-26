package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao04 {
    // Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado
    // Condição valorParcela >= 1000
    public static void main(String[] args) {
        int valorCarro = 50000;
        int valorParcela = 2300;
        int parcelas = 0;

        while(valorParcela <= valorCarro){
            valorParcela += 2300;
            if(valorParcela >= valorCarro){
                break;
            }
            parcelas += 1;

            
        }
        System.out.println(valorParcela);
        System.out.println("Parcelas a pagar: " + parcelas);

        double valorTotal = 50000;
        
        for(int parcela = 1; parcela <= valorTotal; parcela++){
            double valorPrestacao = valorTotal / parcela;
            if(valorPrestacao < 1000){
               break;   
            }
            System.out.printf("Parcelado em " + parcela + " vezes: R$ %.2f %n", valorPrestacao);
            
            
        }
    }


}
