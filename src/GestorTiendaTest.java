
import org.junit.jupiter.api.Test;

public class GestorTiendaTest {

    private GestorTienda gestor = new GestorTienda();


    @Test
     void calcularDescuento(){

        assert equals(gestor.calcularDescuento(100,4));
        assert equals(5.0gestor.calcularDescuento(100,7));
    }

}
