import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FloydTest {

    @Test
    void camCorto() {
        System.out.println("Corto");
        Floyd instance = new Floyd();
        instance.CamCorto();
    }

    @Test
    void centGrafo() {
        System.out.println("Grafo");
        Floyd instance = new Floyd();
        instance.CentGrafo();
    }
}