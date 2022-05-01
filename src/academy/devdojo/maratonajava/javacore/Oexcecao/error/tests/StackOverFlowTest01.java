package academy.devdojo.maratonajava.javacore.Oexcecao.error.tests;

public class StackOverFlowTest01 {
    public static void main(String[] args) {
        recursividade();
    }

    public static void recursividade(){
        recursividade();
    }
}
