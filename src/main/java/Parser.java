import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class Parser {

    public static void main(String[] args) {

        String path = "C:\\Users\\IStetsyuk\\Desktop\\SED";
        File f = new File(path);
        List l = null;
        try {
             l = Files.walk(Paths.get(path))
//                     .filter(x -> x.)
                     .map(Path::getFileName)
                    .collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
        }
        l.forEach(System.out::println);
    }
}
