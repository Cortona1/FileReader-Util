package wordReader;

import java.io.File;



public class Main {

    public static void main(String[] args) throws Exception {
        File file = new File("src/textfiles/textFiles.txt");

        TextReader test = new TextReader(file);
        System.out.println(test.wordsThatContainBlue());
    }
}