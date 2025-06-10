// Implementacion de AdvancedMediaPlayer
public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("Reproduciendo VLC: " + fileName);
    }

    @Override
    public void playMp4(String fileName) {
        // No hace nada, no soporta mp4
    }
}