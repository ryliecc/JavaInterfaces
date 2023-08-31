public class VideoPlayer implements Playable{
    String video = "Miley Cyrus - Used To Be Young (Official Video)";
    @Override
    public void play() {
        System.out.println("Now playing: " + video);

    }
}
