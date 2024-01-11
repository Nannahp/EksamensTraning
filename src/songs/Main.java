package songs;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Song song1 = new Song("hello", "me", 88);
        Song song2 = new Song("Goodbye", "me", 99);
        Playlist playlist = new Playlist(song1,song2);

        System.out.println(playlist.getTotalDuration());
        playlist.save();

    }
}
