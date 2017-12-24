package org.bakhitov.game.balda;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Mike on 19.12.2017.
 */
public class Game {

    @Autowired
    public Dictionary dictionary;

    public void start(){
        System.out.println(dictionary);
    }

    public void setDictionary(Dictionary dictionary) {
        this.dictionary = dictionary;
    }
}
