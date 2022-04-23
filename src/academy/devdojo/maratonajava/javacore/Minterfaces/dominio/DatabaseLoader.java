package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

public class DatabaseLoader implements DataLoader, DataRemover {
    // private -> default -> protected - public
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

    public static void retrieveMaxDataSize(){
        System.out.println("Dentro do retrieveMaxDataSize DatabaseLoader");
    }


}
