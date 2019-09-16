package wordReader;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class TextReader {
private List<String> textList;
private Scanner reader;

public TextReader(File file) throws Exception {
    this.reader = new Scanner(file);
    this.textList = new ArrayList<String>();

    // We will take the text file read line by line and add to the list
    while(this.reader.hasNextLine()) {
        this.textList.add(this.reader.nextLine());
    }
}

public List<String> wordsThatContainBlue(){
    List wordsWithBlue = new ArrayList<String>();

    for (String string : this.textList) {
        if(string.contains("Blue")){
            wordsWithBlue.add(string);
        }
    }
    return wordsWithBlue;
}

public List<String> palindromes() {
    List palindromes = new ArrayList<String>();

    for (String string : this.textList) {
        String reverse = "";
        String helper = string.toLowerCase();
        for (int i = string.length()-1; i >= 0; i--) {
            reverse += string.toLowerCase().charAt(i);
        }
        if (helper.equals(reverse)) {
            palindromes.add(string);
        }
    }
    return palindromes;
}
}
