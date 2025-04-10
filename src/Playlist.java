import java.util.concurrent.CopyOnWriteArrayList;

public class Playlist {
    private String name;
    private ArrayList<String> tracks;

    public PlayList(String name) {
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
