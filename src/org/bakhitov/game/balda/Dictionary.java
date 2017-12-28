package org.bakhitov.game.balda;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * Created by Mike on 19.12.2017.
 */
public class Dictionary {

    private boolean start = false;

    private boolean end = false;

    private char character;

    private List<Dictionary> characters = new ArrayList<>();


    public char getCharacter() {
        return character;
    }

    public void setCharacter(char character) {
        this.character = character;
    }

    public List<Dictionary> getCharacters() {
        return characters;
    }

    public Dictionary setSubDictionary(Dictionary subDictionary){
        int index = characters.indexOf(subDictionary);
        if ( index == -1) {
            characters.add(subDictionary);
            return subDictionary;
        }
        Dictionary d = characters.get(index);
        if (subDictionary.isEnd() && !d.isEnd()){
            d.setEnd(true);
        }
        return d;

    }

    public boolean isStart() {
        return start;
    }

    public void setStart(boolean start) {
        this.start = start;
    }

    public boolean isEnd() {
        return end;
    }

    public void setEnd(boolean end) {
        this.end = end;
    }

    @Override
    public String toString() {
        return "Dictionary contain " + new String(new char[]{character});
    }

    @Override
    public boolean equals (Object obj){
        if (!(getClass() == obj.getClass())){
            return false;
        }
        Dictionary d = (Dictionary)obj;
        return character == d.getCharacter();

    }
}
