// Objeto concreto observador
public class User implements Observer {
    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void update(Video video) {
        System.out.println("👀 " + name + " está viendo el video \"" + video.getTitle() + "\"");
        video.addView();

        System.out.println("👍 " + name + " ha dado like al video \"" + video.getTitle() + "\"");
        video.addLike();
    }
}
