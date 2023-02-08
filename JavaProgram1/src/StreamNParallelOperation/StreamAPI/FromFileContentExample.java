package StreamNParallelOperation.StreamAPI;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FromFileContentExample {
    public static void main(String[] args) throws IOException{
        Path path = Paths.get("C:\\Users\\bange\\OneDrive\\바탕 화면\\Documents\\GitHub\\JavaProgramming\\JavaProgram1\\src\\StreamNMultiProcess\\StreamAPI\\linedata.txt");
        Stream<String> stream;

        //Files.lines() method
        stream = Files.lines(path, Charset.defaultCharset());
        stream.forEach(System.out::println);
        System.out.println();

        //BufferedReader lines() method
        File file = path.toFile();
        FileReader fileReader = new FileReader(file);
        BufferedReader br = new BufferedReader(fileReader);
        stream = br.lines();
        stream.forEach(System.out::println);
    }
}
