package article;

import java.util.ArrayList;

public class Article {
    private String heading;
    private String body;
    private String author;

    public Article(String heading, String body, String author){
        this.heading = heading;
        this.body = body;
        this.author = author;
    }
    public String getLongestWord(){
        String[]  lines =  body.split("\\W+");
        String longestWord = "";
        for(String word: lines) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        return longestWord;
    }

    public ArrayList<String> getWord(){
        ArrayList<String> listOfUniqueWords = new ArrayList<>();
        String[]  lines =  body.split("\\W+");
        for (String word: lines){
            if(!listOfUniqueWords.contains(word)){
                listOfUniqueWords.add(word);
            }
        }
        return listOfUniqueWords;
    }

}
