public class Main {
    public static void main(String[] args) {
        // Crear archivos
        File file1 = new File("photo.png", 1200);
        File file2 = new File("song.mp3", 5000);
        File file3 = new File("video.mp4", 15000);
        File file4 = new File("document.txt", 800);

        // Crear directorios
        Directory root = new Directory("root");
        Directory images = new Directory("images");
        Directory music = new Directory("music");
        Directory videos = new Directory("videos");
        Directory docs = new Directory("docs");

        // Construir árbol de directorios
        root.add(images);
        root.add(music);
        root.add(docs);

        images.add(file1);
        music.add(file2);
        music.add(videos);
        videos.add(file3);
        docs.add(file4);

        // Imprimir estructura
        root.print("");

        // Mostrar tamaño total de root
        System.out.println("\nTamaño total de 'root': " + root.getSize() + " bytes");
    }
}
