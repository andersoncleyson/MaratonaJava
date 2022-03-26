package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturaCondicionais06 {
    public static void main(String[] args){
        byte dia = 7;
        switch (dia){
            default:
                System.out.println("Dia útil, que pena");
                break;
            case 7:
                System.out.println("É Sabadão!");
                break;
            case 1:
                System.out.println("É Domingo, dia de não fazer absolutamente");
                break;
        }
    }
}
