// Clase cliente que usa el Adapter
public class AudioPlayer implements MediaPlayer {

    private MediaPlayer mediaPlayer;

    @Override
    public void play(String audioType, String fileName) {
        if ("mp3".equalsIgnoreCase(audioType)) {
            mediaPlayer = new Mp3Player();
        } else if ("vlc".equalsIgnoreCase(audioType) || "mp4".equalsIgnoreCase(audioType)) {
            mediaPlayer = new MediaAdapter(audioType);
        } else {
            System.out.println("Formato no soportado: " + audioType);
            return;
        }
        mediaPlayer.play(audioType, fileName);
    }
}

