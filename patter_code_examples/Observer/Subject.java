// Interfaz para los objetos observables.
public interface Subject {
    void attach(Observer o);
    void detach(Observer o);
    void notifyObservers(Video video);
}
