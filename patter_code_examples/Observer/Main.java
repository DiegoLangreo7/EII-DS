// Clase para probar el patrón Observer en Java.
public class Main {
    public static void main(String[] args) {
        YouTubeChannel channel = new YouTubeChannel("DiegoLangreo7");

        Observer aitor = new User("Aitorcius");
        Observer oscar = new User("Mitocan8");
        Observer david = new User("DavidCG");

        channel.attach(aitor);
        channel.attach(oscar);
        channel.attach(david);

        channel.publishVideo("Patrón Observer explicado en 5 minutos");
        channel.publishVideo("Cómo implementar Observer en Java desde cero");
    }
}
