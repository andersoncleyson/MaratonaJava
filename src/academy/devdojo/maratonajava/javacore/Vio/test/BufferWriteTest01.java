package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriteTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try(FileWriter fw = new FileWriter(file, true);
        BufferedWriter br = new BufferedWriter(fw)){
            br.write("Tanta coisa depende de um carrinho de mão vermelho");
            br.newLine();
            br.flush();

        } catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
