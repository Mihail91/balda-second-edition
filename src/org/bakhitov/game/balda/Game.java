package org.bakhitov.game.balda;

import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;

/**
 * Created by Mike on 19.12.2017.
 */
public class Game {
    @Autowired
    public Dictionary dictionary;

    @Autowired
    public Parser parser;

    public void start(){
        System.out.println(dictionary);
        try {
            System.out.println(parser.initiateDictionary());

            System.out.println(dictionary);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    public void setDictionary(Dictionary dictionary) {
        this.dictionary = dictionary;
    }

    public void setParser(Parser parser) {
        this.parser = parser;
    }
}
