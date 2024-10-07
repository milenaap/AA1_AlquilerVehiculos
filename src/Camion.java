public class Camion extends Vehiculo {
    //-------------------Atributos ----------------------------------
    private int kilogramos;


    //-------------------Constructor --------------------------------



    public Camion(String matricula, String marca, String modelo, int kilogramos) {
        super(matricula, marca, modelo);
        this.kilogramos = kilogramos;
    }
    //-------------------Getter and Setter --------------------------------


    public int getKilogramos() {
        return kilogramos;
    }

    public void setKilogramos(int kilogramos) {
        this.kilogramos = kilogramos;
    }

    //-------------------Metodos(toString) --------------------------------


    @Override
    public String toString() {
        String baseStr = super.toString();
        return baseStr +
                " Camion{" +
                "kilogramos= " + kilogramos +
                '}';
    }
}