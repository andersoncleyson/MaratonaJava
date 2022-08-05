package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

public class BasicFileAttributeTest02 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("pasta2/novo_path.txt");
        BasicFileAttributes basicFileAtributes = Files.readAttributes(path, BasicFileAttributes.class);
    }
}
