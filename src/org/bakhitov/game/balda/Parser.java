package org.bakhitov.game.balda;

import org.springframework.beans.factory.annotation.Autowired;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import static java.lang.System.*;

/**
 * Created by Mike on 26.12.2017.
 */
public class Parser {

    private Dictionary dictionary;

    private String fileName;

    Parser(Dictionary dictionary, String fileName){
        this.dictionary = dictionary;
        this.fileName = fileName;
    }

    public String initiateDictionary() throws IOException {
        StringBuffer sb = new StringBuffer();
        try ( BufferedReader br = new BufferedReader(new FileReader(fileName))) {
           String s;
            for(;;) {
                s = br.readLine();
                if (s == null){
                    return sb.toString();
                }
                sb.append(s);
                setWordInDictionary(s);
                sb.append('\n');
            }
        }
    }

    private void setWordInDictionary(String word){
        Dictionary d = dictionary;
        for (int i = 0; i < word.length(); i++) {
            Dictionary subDictionary = new Dictionary();
            subDictionary.setCharacter(word.charAt(i));
            d = d.setSubDictionary(subDictionary);
        }
        d.setEnd(true);
    }
}
