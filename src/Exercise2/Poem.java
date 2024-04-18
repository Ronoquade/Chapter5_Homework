package Exercise2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Poem {

    private String name;
    private String poet;

    /**
     * no-arg constructor
     */
    public Poem()
    {
        // initialize attributes
        name = "unknown";
        poet = "unknown";
    }

    public Poem(String name, String poet) {
        this.name = name;
        this.poet = poet;
    }

    /**
     * @return the name
     */
    public String getName()
    {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name)
    {
        this.name = name;
    }

    /**
     * @return the poet
     */
    public String getPoet()
    {
        return poet;
    }

    /**
     * @param poet the poet to set
     */
    public void setPoet(String poet)
    {
        this.poet = poet;
    }

    @Override
    public String toString()
    {
        return "Poem [name=" + name + ", poet=" + poet + "]";
    }

    public static void main(String[] args) {
        Poem one = new Poem();
        Poem two = new Poem();
        Poem three = new Poem();
        Poem[] poems = {one, two, three};

        try(BufferedWriter bw = new BufferedWriter(new FileWriter("poems.txt"))) {
            for(Poem p: poems) {
                bw.write(String.format("The name of the poem: %s\n", p.name));
                bw.write(String.format("The name of the poet: %s\n\n", p.poet));
            }

        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}


