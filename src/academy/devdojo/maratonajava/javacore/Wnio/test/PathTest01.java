package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest01 {
    public static void main(String[] args){
        Path p1 = Paths.get("/home/robot/codes/JAVA/maratona-java/pasta2/arquivo_renomeado.txt");
        System.out.println(p1.getFileName());
    }
}
