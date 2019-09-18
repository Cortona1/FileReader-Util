package wordReader;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;

public class TextReader  {
private List<String> textList;
private Scanner reader;
private String vowels;

public TextReader(File file) throws Exception {
    this.reader = new Scanner(file);
    this.textList = new ArrayList<String>();
    this.vowels = "aeiou";

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

    public List<String> wordsContainingAllVowels() {
        List wordsWhichContainAllVowels = new ArrayList<String>();

        for (String string : this.textList) {
            if (containsAllVowels(string)) {
                wordsWhichContainAllVowels.add(string);
            }
        }
        return wordsWhichContainAllVowels;
    }

    private boolean containsAllVowels(String word) {
        for (char vowel : this.vowels.toCharArray()) {
            if (!word.contains("" + vowel)) {
                return false;
            }
        }
        return true;
    }

    public List<String> sortWordsAscending() {
        List sortedList = this.textList;
        Collections.sort(sortedList);
        return sortedList;
    }
}
