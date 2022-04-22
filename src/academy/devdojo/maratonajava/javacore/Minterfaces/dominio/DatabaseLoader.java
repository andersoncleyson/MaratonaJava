package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

public class DatabaseLoader implements DataLoader, DataRemover {
    @Override
    public void load(){
        System.out.println("Loading data from database");
    }

    @Override
    public void remove() {
        System.out.println("Deleted from database");
    }

    @Override
    public void checkPermission() {
        DataLoader.super.checkPermission();
    }
}
