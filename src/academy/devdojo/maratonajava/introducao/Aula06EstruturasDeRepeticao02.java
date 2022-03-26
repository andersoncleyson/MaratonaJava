package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao02 {
    public static void main (String[] args){
        //Imprima todos os núemros pares de 0 até 1000
        for(int i = 0; i <= 1000; i++){
            if(i % 2 > 0){
                continue;
            } else {
                System.out.println(i);
            }
        }
    }
}
