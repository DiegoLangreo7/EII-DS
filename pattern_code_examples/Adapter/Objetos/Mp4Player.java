// Implementacion de AdvancedMediaPlayer
public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        // No hace nada, no soporta vlc
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Reproduciendo MP4: " + fileName);
    }
}