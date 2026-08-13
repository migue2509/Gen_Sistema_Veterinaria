public class Clinica implements Asegurable {
    protected String nombre;
    protected String direccion;

    public Clinica(String nombre, String direccion){
        this.nombre = nombre;
        this.direccion = direccion;
    }

    @Override
    public double calcularPrimeSeguro() {
        return 5000000;
    }

    @Override
    public String obtenerNumeroPoliza() {
        return "POL-CLINICA-"+this.nombre.toUpperCase();
    }

}
