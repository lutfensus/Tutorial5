import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

public class Playlist {
    private String name;
    private ArrayList<String> tracks;

    public Playlist(String name) {
        this.name = name;
        this.tracks = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void display() {
        for (String track : tracks) {

            System.out.println(track);

        }
    }

    public void addTrack(String track) {
        tracks.add(track);
    }
    public void removeTrack(String track) {
        tracks.remove(track);

    }



}