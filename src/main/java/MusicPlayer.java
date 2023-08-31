public class MusicPlayer implements Playable{
    String song = "Younger Now - Miley Cyrus";
    @Override
    public void play() {
        System.out.println("Now playing: " + song);

    }
}
