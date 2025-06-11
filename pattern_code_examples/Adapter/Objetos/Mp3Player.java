public class Mp3Player implements MediaPlayer {
    @Override
    public void play(String audioType, String fileName) {
        System.out.println("Reproduciendo MP3: " + fileName);
    }
}