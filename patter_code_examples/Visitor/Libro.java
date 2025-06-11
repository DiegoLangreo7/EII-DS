// Representa una estructura de objetos a recorrer por el patrón Visitor

import java.util.ArrayList;
import java.util.List;

public class Libro {
    private final List<ElementoLibro> elementos = new ArrayList<>();

    public void agregarElemento(ElementoLibro elemento) {
        elementos.add(elemento);
    }

    public void aceptar(Visitor visitor) {
        for (ElementoLibro elemento : elementos) {
            elemento.accept(visitor);
        }
    }
}
