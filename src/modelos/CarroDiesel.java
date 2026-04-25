package modelos;

import interfaces.Motor;
import interfaces.RelacionesDiferenciales;
import interfaces.Suspension;

/**
 * Tipo de carro que utiliza motor diesel.
 */
public class CarroDiesel extends Carro {

    public CarroDiesel(Motor motor, RelacionesDiferenciales relacion, Suspension suspension) {
        super(motor, relacion, suspension);
        System.out.println("Carro de Diesel");
    }

    @Override
    public void tipoCarroOffRoad() {
        // Sobrescritura: este método proporciona la implementación concreta para diesel
        System.out.println("Tipo de carro: Diesel 4x4 para autocross");
        // Polimorfismo: los componentes implementan la misma interfaz pero ejecutan
        // comportamientos específicos.
        motor.tipo();
        relacion.tipo();
        suspension.tipo();
    }
}
