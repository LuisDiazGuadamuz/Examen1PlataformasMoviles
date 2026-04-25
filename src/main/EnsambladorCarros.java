package main;

import implementaciones.MotorDiesel5000;
import implementaciones.MotorDiesel6000;
import implementaciones.MotorGasolina5000;
import implementaciones.MotorGasolina6000;
import implementaciones.Relacion47;
import implementaciones.Relacion49;
import implementaciones.SuspensionARB25;
import implementaciones.SuspensionTJM35;
import interfaces.Motor;
import interfaces.RelacionesDiferenciales;
import interfaces.Suspension;
import modelos.Carro;
import modelos.CarroDiesel;
import modelos.CarroGasolina;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase principal que crea todas las combinaciones posibles de carros 4x4.
 */
public class EnsambladorCarros {

    public static void main(String[] args) {
        Motor[] motores = {
                new MotorGasolina5000(),
                new MotorGasolina6000(),
                new MotorDiesel5000(),
                new MotorDiesel6000()
        };

        RelacionesDiferenciales[] relaciones = {
                new Relacion47(),
                new Relacion49()
        };

        Suspension[] suspensiones = {
                new SuspensionARB25(),
                new SuspensionTJM35()
        };

        // Polimorfismo: la lista contiene referencias de tipo Carro,
        // pero los objetos pueden ser CarroGasolina o CarroDiesel.
        List<Carro> carros = new ArrayList<>();

        for (Motor motor : motores) {
            for (RelacionesDiferenciales relacion : relaciones) {
                for (Suspension suspension : suspensiones) {
                    Carro carro;
                    if (motor instanceof MotorGasolina5000 || motor instanceof MotorGasolina6000) {
                        carro = new CarroGasolina(motor, relacion, suspension);
                    } else {
                        carro = new CarroDiesel(motor, relacion, suspension);
                    }
                    carros.add(carro);
                }
            }
        }

        System.out.println("\n=== Todas las combinaciones de carros 4x4 para autocross ===\n");
        for (Carro carro : carros) {
            System.out.println("--- Nueva combinación ---");
            carro.tipoCarroOffRoad();
            System.out.println();
        }
    }
}
