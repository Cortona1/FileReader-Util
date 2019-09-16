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
}
