package keyword;

import java.security.Key;
import java.util.ArrayList;

public class Keyword {
    private String word;
    private String definition;
    private ArrayList<Keyword> seeAlso = new ArrayList<>();

    public Keyword(String word, String definition, Keyword...keywords){
        this.word = word;
        this.definition = definition;
        for(Keyword keyword: keywords){
            seeAlso.add(keyword);
        }

    }
    public boolean matches(String word){
        if(this.word.equalsIgnoreCase(word)){
            return true;
        }
        else return false;
    }
    private String getWord(){
        return  word;
    }
    private String getSeeAlsoWords() {
        StringBuilder words = new StringBuilder();
        for (Keyword word : seeAlso) {
            words.append(word.getWord());
        }
        return words.toString();
    }

    @Override
    public String toString() {
        return "Keyword{" +
                "word='" + word + '\'' +
                ", definition='" + definition + '\'' +
                ", seeAlso=" + getSeeAlsoWords() +
                '}';
    }
}
