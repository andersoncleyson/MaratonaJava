package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

public class FileLoader implements DataLoader, DataRemover{
    @Override
    public void load() {
        System.out.println("Loading data from files");
    }

    @Override
    public void remove() {
        System.out.println("Deteted from database");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checking permissions files");
    }
}
