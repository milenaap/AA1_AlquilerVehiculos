import java.util.Calendar;
import java.util.Date;

public class AA1_AlquilerVehiculos {

    public static void  main(String[] args) {
        AA1_AlquilerVehiculos aa1 = new AA1_AlquilerVehiculos();
        aa1.inicio();
    }

    void inicio() {
        // Crea un objeto de cada una de las clases Coche, Moto y Camión.
        // TODO
        Vehiculo coche1 = new Coche("ABC445", "Mercedes", "AR2", 4,5);
        Vehiculo moto1 = new Moto("TGF1255", "Yamaha", "R1", 200);
        Vehiculo camion1 = new Camion( "MNC888", "Ford", "NX500", 1500);

        // Crea dos objetos de tipo cliente.
        // TODO
        Cliente cliente1 = new Cliente("B36784044", "Splytin");
        Cliente cliente2 = new Cliente("B77733399", "Famindex");


        // Crea tres contratos de alquiler, uno para cada tipo de vehículo, dos de los contratos tendrán el mismo cliente.
        // TODO
        Calendar calendario = Calendar.getInstance(); // Crea una instancia Calendar

        // Contrato de Alquiler de Coche
        calendario.set(2024,Calendar.JANUARY, 10); // Setiar una fecha
        Date fechaInicioCoche = calendario.getTime(); // Obtiene la fecha en formato
        Date fechaFinCoche = new Date(fechaInicioCoche.getTime()+ (5L *24 *60 *60 *1000));
        ContratoAlquiler contratoAlquilerCoche = new ContratoAlquiler( fechaInicioCoche, fechaFinCoche, 50.f, coche1, cliente1);

        // Contrato de Alquiler de Moto
        calendario.set(2024,Calendar.APRIL, 8); // Setiar una fecha
        Date fechaInicioMoto = calendario.getTime(); // Obtiene la fecha en formato
        Date fechaFinMoto = new Date(fechaInicioMoto.getTime()+ (3L *24 *60 *60 *1000));
        ContratoAlquiler contratoAlquilerMoto = new ContratoAlquiler(fechaInicioMoto, fechaFinMoto, 30.f, moto1, cliente1);

        // Contrato de Alquiler del Camión
        calendario.set(2024,Calendar.SEPTEMBER, 27); // Setiar una fecha
        Date fechaInicioCamion = calendario.getTime(); // Obtiene la fecha en formato
        Date fechaFinCamion = new Date(fechaInicioCamion.getTime()+ (7L *24 *60 *60 *1000));
        ContratoAlquiler contratoAlquilerCamion = new ContratoAlquiler(fechaInicioCamion, fechaFinCamion, 150.f, camion1, cliente2);


        //Utilizando los métodos toString, muestra por pantalla los datos de todos los objetos que has creado.
        // TODO
        System.out.println("El Coche tiene: " + coche1.toString());
        System.out.println("La Moto tiene: " + moto1.toString());
        System.out.println("El Camion tiene: " +  camion1.toString());
        System.out.println("El Cliente 1 es: " + cliente1.toString());
        System.out.println("El Cliente 2 es: " + cliente2.toString());
        System.out.println("El Contrato de Alquiler del Coche contiene: " + contratoAlquilerCoche.toString());
        System.out.println("El Contrato de Alquiler de la Moto contiene: " + contratoAlquilerMoto.toString());
        System.out.println("El Contrato de Alquiler del Camión contiene: " + contratoAlquilerCamion.toString());
        System.out.println("Duracion del contrato de alquiler del Coche son: " +contratoAlquilerCoche.nDias() +" días");
        System.out.println("Duración del contrato de alquiler de la Moto son: " +contratoAlquilerMoto.nDias() + " días");
        System.out.println("Duración del contrato de alquiler del Camión son: " +contratoAlquilerCamion.nDias() + " dias");
        System.out.println("El coste total del contrato de alquiler del Coche es: " + contratoAlquilerCoche.costeTotal() + " €");
        System.out.println("El coste total del contrato de alquiler de la Moto es: " + contratoAlquilerMoto.costeTotal() + " €");
        System.out.println("El coste total del contrato de alquiler del Camión es: " + contratoAlquilerCamion.costeTotal() + " €");

    }
}
