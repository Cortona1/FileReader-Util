package wordReader;

import java.io.File;


public class Main {

    public static void main(String[] args) throws Exception {
        File file = new File("src/textfiles/textFiles.txt");

        TextReader test = new TextReader(file);
        System.out.println(test.wordsThatContainBlue());
        System.out.println(test.palindromes());
        System.out.println(test.wordsContainingAllVowels());
        System.out.println(test.sortWordsAscending());
        System.out.println(test.sortWordsReverse());
    }
}
