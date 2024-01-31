import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CCuentaTest {
    @Test
    @DisplayName("Cantidad negativa")
    public void testCantidadNegativa() {
        CCuenta c1 = new CCuenta("gemma","1111",5);
        assertEquals("No se puede ingresar una cantidad negativa", c1.ingresar(-1));
    }

    @Test
    @DisplayName("Cantidad positiva")
    public void testCantidadPositiva() {
        CCuenta c1 = new CCuenta("gemma","1111",5);
        assertEquals("El ingreso ha sido correcto", c1.ingresar(1));


    }

    @Test
    @DisplayName("Cantidad cero")
    public void testCantidadCero() {
        CCuenta c1 = new CCuenta("gemma","1111",5);
        assertEquals("No se puede ingresar una cantidad negativa", c1.ingresar(0));

    }

    @Test
    @DisplayName("Saldo suficiente")
    public void testSaldoSuficiente() {
        CCuenta c1 = new CCuenta("gemma","5555",2);
        assertEquals("Dinero retirado satisfactoriamente", c1.retirar(1));
        assertEquals(1, c1.saldo());

    }

    @Test
    @DisplayName("Saldo igual cantidad")
    public void testSaldoIgual() {
        CCuenta c1 = new CCuenta("Jacinto","6666",1);
        assertEquals("Dinero retirado satisfactoriamente", c1.retirar(1));
        assertEquals(0, c1.saldo());
    }

    @Test
    @DisplayName("Saldo insuficiente")
    public void testSaldoInsufiente() {
        CCuenta c1 = new CCuenta("Gemma","7777",1);
        assertEquals("No hay suficiente saldo", c1.retirar(2));
        assertEquals(1, c1.saldo());
    }

    @Test
    @DisplayName("Retirar cantidad negativa")
    public void testRetirarCantidadNegativa() {
        CCuenta c1 = new CCuenta();

        assertEquals("No se puede retirar una cantidad negativa", c1.retirar(-1));

    }

    @Test
    @DisplayName("Retirar Cantidad cero")
    public void testRetirarCantidadCero() {
        CCuenta c1 = new CCuenta();
        assertEquals("No se puede retirar una cantidad negativa", c1.retirar(0));
    }


}
