public class Cliente {
    //------------------------------ Atributos ----------------------------------------------
    private String nif;
    private String nombre;

    //------------------------------ Constructores ------------------------------------------

    public Cliente(String nif, String nombre) {
        this.nif = nif;
        this.nombre = nombre;
    }

    //------------------------------ Getter an Setter ---------------------------------------

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //------------------------------ Metodos(toString, etc....)---------------------------------------


    @Override
    public String toString() {
        return "Cliente{" +
                "nif= '" + nif + '\'' +
                ", nombre= '" + nombre + '\'' +
                '}';
    }
}