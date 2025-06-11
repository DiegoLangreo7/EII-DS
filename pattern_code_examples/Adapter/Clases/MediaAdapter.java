// Adapter de clase: hereda de AdvancedMediaPlayer y adapta a MediaPlayer
public class MediaAdapter extends AdvancedMediaPlayer implements MediaPlayer {

    private final String audioType;

    public MediaAdapter(String audioType) {
        this.audioType = audioType.toLowerCase();
    }

    @Override
    public void play(String audioType, String fileName) {
        if (this.audioType.equals("vlc")) {
            playVlc(fileName);
        } else if (this.audioType.equals("mp4")) {
            playMp4(fileName);
        } else {
            System.out.println("Formato no soportado por MediaAdapter: " + audioType);
        }
    }
}
