package modelos;

import interfaces.Motor;
import interfaces.RelacionesDiferenciales;
import interfaces.Suspension;

/**
 * Clase abstracta que representa un carro 4x4 en la categoría off-road.
 *
 * Esta clase demuestra composición porque contiene componentes (motor,
 * relación diferencial y suspensión) como atributos.
 */
public abstract class Carro {

    protected final Motor motor;
    protected final RelacionesDiferenciales relacion;
    protected final Suspension suspension;

    /**
     * Constructor que recibe las dependencias por inyección de dependencias.
     *
     * @param motor      el componente motor
     * @param relacion   el componente de relación diferencial
     * @param suspension el componente de suspensión
     */
    public Carro(Motor motor, RelacionesDiferenciales relacion, Suspension suspension) {
        // Inyección de dependencias: los componentes se pasan desde afuera
        this.motor = motor;
        this.relacion = relacion;
        this.suspension = suspension;
    }

    /**
     * Método abstracto que debe ser implementado por cada tipo de carro.
     */
    public abstract void tipoCarroOffRoad();
}
