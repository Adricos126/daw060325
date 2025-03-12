
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GestorTiendaTest {

    private GestorTienda gestor = new GestorTienda();


    @Test
     void calcularDescuento(){

        assertEquals(0,gestor.calcularDescuento(0.04,100));


    }

    @Test

    void calcularDescuento2(){

        assertEquals(100 * 0.05,gestor.calcularDescuento(100,7));
    }

    @Test
    void categorizarProducto(){
        assertEquals("Economico, ",gestor.categorizarProducto(10));

    }

    @Test
    void categorizarProducto2(){
        assertEquals("Estandar ",gestor.categorizarProducto(20));
    }

    @Test
    void categorizarProducto3(){
        assertEquals("Premium", gestor.categorizarProducto(100));
    }



    @Test
    void buscarProductoNoExistente(){

        String[] inventario = {"Producto A", "Producto B"};
        String producto = "Producto C";

        assertEquals(null, gestor.buscarProducto(inventario, producto),"No existe");

    }

}
