package songs;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;

public class Playlist {

    private ArrayList<Song> songs = new ArrayList<>();

    public Playlist(Song...song){
        for(Song curretnSong: song){
        songs.add(curretnSong);}
    }


    public int getTotalDuration(){
        int totalDuration=0;
        for(Song song: songs){
            totalDuration += song.getDuration();
        }
        return totalDuration;
    }

    public void save(){
        File file = new File("src" + File.separator + "songs.csv");
        try{
            file.createNewFile();
          } catch (IOException e) {
            System.out.println("something went wrong");
        }
        try {
            PrintStream ps = new PrintStream(file);
            for(Song song: songs){
                ps.append(song.getTitle() + "," + song.getArtist() +"," +song.getDuration());
                ps.println();
            }
        }
        catch (IOException e){
            System.out.println("Something went wrong");
        }


    }
}
