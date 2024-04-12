package es.ies.puerto.enumerado;

import org.junit.jupiter.api.Test;

public class VehiculoTest {
    TipoVehiculo tipoVehiculo;
    @Test
    public void vehiculoBiciTest() {
        tipoVehiculo = TipoVehiculo.BICI;
        System.out.println(tipoVehiculo.getTipo());
    }
}
