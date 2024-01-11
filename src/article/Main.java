package article;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Article article = new Article("Title", "This is the body example, it is very long", "Me");
        System.out.println(article.getLongestWord());
        ArrayList<String> listOfWords = article.getWord();
        for (String word: listOfWords) {
            System.out.println(word);

        }
    }
}
