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
        Poem[] poems = new Poem[4];
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String data;
                while((data = br.readLine()) != null) {
                    for(int i = 0; i < 4; i++) {
                        poems[i] = new Poem();
                    }
                    for(Poem p: poems) {
                        p.setName(data);
                        data = br.readLine();
                        p.setPoet(data);
                        System.out.printf("The name of the poem: %s\nThe name of the poet: %s\n\n", p.getName(),p.getPoet());
                        data = br.readLine();
                    }
                }
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }
}
