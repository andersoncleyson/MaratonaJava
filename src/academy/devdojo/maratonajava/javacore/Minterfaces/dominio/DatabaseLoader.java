package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

public class DatabaseLoader implements DataLoader {
    @Override
    public void load(){
        System.out.println("Loading data from database");
    }
}
