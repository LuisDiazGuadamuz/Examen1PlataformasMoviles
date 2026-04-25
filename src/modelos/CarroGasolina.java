package modelos;

import interfaces.Motor;
import interfaces.RelacionesDiferenciales;
import interfaces.Suspension;

/**
 * Tipo de carro que utiliza motor a gasolina.
 */
public class CarroGasolina extends Carro {

    public CarroGasolina(Motor motor, RelacionesDiferenciales relacion, Suspension suspension) {
        super(motor, relacion, suspension);
        System.out.println("Carro de Gasolina");
    }

    @Override
    public void tipoCarroOffRoad() {
        // Sobrescritura: este método reemplaza el comportamiento abstracto de Carro
        System.out.println("Tipo de carro: Gasolina 4x4 para autocross");
        // Polimorfismo: se invoca el mismo método tipo() en distintos componentes
        motor.tipo();
        relacion.tipo();
        suspension.tipo();
    }
}
