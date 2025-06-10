// Cliente que usa MediaPlayer
public class AudioPlayer implements MediaPlayer {
    private MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String fileName) {
        audioType = audioType.toLowerCase();

        // Formatos nativos soportados
        switch (audioType) {
            case "mp3":
                System.out.println("Reproduciendo MP3: " + fileName);
                break;
            case "vlc":
            case "mp4":
                mediaAdapter = new MediaAdapter(audioType);
                mediaAdapter.play(audioType, fileName);
                break;
            default:
                System.out.println("Formato no soportado: " + audioType);
                break;
        }
    }
}
