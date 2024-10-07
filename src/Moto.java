public class Moto extends Vehiculo{

    //------------------------ Atributos ------------------------------------------
    private int cilindrada;


    //------------------------ Constructor -----------------------------------------


    public Moto(String matricula, String marca, String modelo, int cilindrada) {
        super(matricula, marca, modelo);
        this.cilindrada = cilindrada;
    }

    //------------------------ Getter and Setter (accesores) -------------------------

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }


    //------------------------ metodos (toString y otros metodos) ----------------------


    @Override
    public String toString() {
        String baseStr = super.toString();
        return baseStr +
                " Moto{" +
                "cilindrada= " + cilindrada +
                '}';
    }
}