// Clase auxiliar para el ejemplo de observador y observable.
public class Video {
    private final String title;
    private int views = 0;
    private int likes = 0;

    public Video(String title) {
        this.title = title;
    }

    public void addView() {
        views++;
    }

    public void addLike() {
        likes++;
    }

    public String getTitle() {
        return title;
    }

    public int getViews() {
        return views;
    }

    public int getLikes() {
        return likes;
    }
}
