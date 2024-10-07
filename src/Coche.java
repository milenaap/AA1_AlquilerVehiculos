public class Coche extends Vehiculo {
    private int puertas;
    private int plazas;


    public Coche(String matricula, String marca, String modelo, int puertas, int plazas) {
        super(matricula, marca, modelo);
        this.puertas = puertas;
        this.plazas = plazas;
    }


    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public int getPlazas() {
        return plazas;
    }

    public void setPlazas(int plazas) {
        this.plazas = plazas;
    }

    @Override
    public String toString() {
        // Agregando el toString de Vehiculo super clase
        String baseStr = super.toString();
        return  baseStr +
                " Coche{" +
                "puertas= " + puertas +
                ", plazas= " + plazas +
                '}';
    }




}


