import java.util.ArrayList;

public class MusicLibrary {
    private ArrayList<String> tracks;
    private ArrayList<Playlist> playlists;
    private String name;
    private String owner;

    public MusicLibrary(String name, String owner) {
        this.name = name;
        this.owner = owner;
        this.tracks = new ArrayList<>();
        this.playlists = new ArrayList<>();
    }


    public void addTrack(String track) {

    }



    public void removeTrack(String track) {
        if (tracks.remove(track)) {

        }
    }

    public void displayTracks() {
        for (String track : tracks) {
            System.out.println(track);
        }
    }

    public void searchTracks(String phrase) {
        for (String track : tracks) {
            if (track.contains(phrase)) {
                System.out.println(track);
            }
        }
    }


    public void createPlaylist(String name) {
        for (Playlist pl : playlists) {
            if (pl.getName().equals(name)) {
                System.out.println("Playlist " + name + " already exists.");
                return;
            }
        }
        playlists.add(new Playlist(name));
    }

    private Playlist findPlaylist(String name) {
        for (Playlist pl : playlists) {
            if (pl.getName().equals(name)) {
                return pl;
            }
        }
        return null;
    }

    public void addTrackToPlaylist(String track, String playlistName) {
        if (!tracks.contains(track)) {
            System.out.println("Track not found.");
            return;
        }
        Playlist pl = findPlaylist(playlistName);
        if (pl != null) {
            pl.addTrack(track);
        } else {
            System.out.println("Playlist " + playlistName + " not found.");
        }
    }

    public void displayPlaylist(String name) {
        Playlist pl = findPlaylist(name);
        // Ligatures are cool
        if (pl != null) {
            System.out.println("Playlist: " + name);
            pl.display();
        } else {
            System.out.println("Playlist " + name + " not found.");
        }
    }

    public void displayAllPlaylists() {
        for (Playlist pl : playlists) {
            System.out.println(pl.getName());
        }
    }

    public int getTrackCount() {
        return tracks.size();
    }

    public int getPlaylistCount() {
        return playlists.size();
    }
}