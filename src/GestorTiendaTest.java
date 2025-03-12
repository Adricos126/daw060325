
import org.junit.jupiter.api.Test;

public class GestorTiendaTest {

    private GestorTienda gestor = new GestorTienda();


    @Test
     void calcularDescuento(){



        assert equals(gestor.calcularDescuento(0.04,100));
        assert equals(gestor.calcularDescuento(100,7));



    }

}
