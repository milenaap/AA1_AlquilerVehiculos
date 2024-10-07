
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class ContratoAlquiler {
    //-------------------Atributos-----------------------------------

    private Date fechaInicio;
    private Date fechaFin;
    private float precioDia;
    private Vehiculo vehiculo;
    private Cliente cliente;

    //-------------------Constructor-----------------------------------

    public ContratoAlquiler(Date fechaInicio, Date fechaFin, float precioDia, Vehiculo vehiculo, Cliente cliente) {
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.precioDia = precioDia;
        this.vehiculo = vehiculo;
        this.cliente = cliente;
    }

    //-------------------Getter and Setter-----------------------------------

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public float getPrecioDia() {
        return precioDia;
    }

    public void setPrecioDia(float precioDia) {
        this.precioDia = precioDia;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    //-------------------Metodos (toString, etc..)---------------------------

    @Override
    public String toString() {
        return "ContratoAlquiler{" +
                " fechaInicio= " + fechaInicio +
                ", fechaFin= " + fechaFin +
                ", precioDia= " + precioDia +
                ", vehiculo= " + vehiculo +
                ", cliente= " + cliente +
                '}';
    }

    public int nDias() {
        //TODO implementar la logica
        // convertir las fechas para calcular las diferencias
        // Calcular la diferencia en milisegundos entre fechaFin y fechaInicio
        long diferenciaEnMilisegundos = fechaFin.getTime() - fechaInicio.getTime();

        // Convertir la diferencia en milisegundos a días
        long diferenciaEnDias = TimeUnit.MILLISECONDS.toDays(diferenciaEnMilisegundos);

        return (int) diferenciaEnDias;
    }

    public float costeTotal() {
        //TODO implementar la logica


        float resultado = nDias() * precioDia;
        return resultado;
    }
}