// Objeto concreto observado por los observadores.
import java.util.ArrayList;
import java.util.List;

public class YouTubeChannel implements Subject {
    private final String name;
    private final List<Observer> observers = new ArrayList<>();

    public YouTubeChannel(String name) {
        this.name = name;
    }

    public void publishVideo(String title) {
        Video video = new Video(title);
        System.out.println("📢 Canal " + name + " ha publicado un nuevo video: " + title);
        notifyObservers(video);
        System.out.println("✅ \"" + video.getTitle() + "\" tiene " + video.getViews() + " vistas y " + video.getLikes() + " likes.\n");
    }

    @Override
    public void attach(Observer o) {
        observers.add(o);
    }

    @Override
    public void detach(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers(Video video) {
        for (Observer o : observers) {
            o.update(video);
        }
    }
}
