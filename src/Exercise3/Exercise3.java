package Exercise3;
import Exercise2.Poem;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class Exercise3 {
    public static void main(String[] args) throws IOException {
        File file = new File("src/Exercise3/poem2.txt");
        Poem[] poems = {new Poem(), new Poem(), new Poem()};
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String data;
            for(Poem p: poems) {
                while((data = br.readLine()) != null) {
                    p.setName(data);

                }
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }
}
