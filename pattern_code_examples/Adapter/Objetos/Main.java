// Para probar el codigo
public class Main {
    public static void main(String[] args) {
        AudioPlayer player = new AudioPlayer();

        player.play("mp3", "cancion.mp3");
        player.play("mp4", "video.mp4");
        player.play("vlc", "pelicula.vlc");
        player.play("avi", "archivo.avi"); // No soportado
    }
}
