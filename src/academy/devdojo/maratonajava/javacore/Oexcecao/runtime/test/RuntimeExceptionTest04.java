package academy.devdojo.maratonajava.javacore.Oexcecao.runtime.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.SQLException;

public class RuntimeExceptionTest04 {
    public static void main(String[] args) {
        try {
            throw new RuntimeException();
        }catch (IndexOutOfBoundsException | ArithmeticException e){
            System.out.println("Dentro do ArrayIndexOutofBounds | IndexOutOfBoundsException | ArithmeticException");
        } catch (RuntimeException e){
            System.out.println("Dentro do RuntimeException");
        }

        try {
            talvezLanceException();
        } catch (SQLException | FileNotFoundException e){
            e.printStackTrace();
        }
    }

    private static void talvezLanceException() throws SQLException, FileNotFoundException {

    }

}
