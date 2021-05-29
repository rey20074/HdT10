import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GrafoTest {

    @Test
    void addEdge() {
        System.out.println("agregar");
        String ciudad = "Ciudad1";
        Grafo instance = new Grafo();
        instance.add(ciudad);
    }

    @Test
    void getEdge() {
        System.out.println("agregarGrafo");
        String ciudad1 = "ciudad1";
        String ciudad2 = "ciudad2";
        int d = 2;
        Grafo instance = new Grafo();
        instance.addEdge(ciudad1, ciudad2,d);
    }
}