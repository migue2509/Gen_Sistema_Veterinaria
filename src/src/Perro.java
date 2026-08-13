public class Perro extends Animal implements Vacunable, Asegurable {
    protected String raza;

    public Perro(String nombre, int edad, String nombreDueno){
        super(nombre, edad, nombreDueno);
        this.raza = raza;
    }

    @Override
    public double precioConsulta() {
        return 45000 + (3000 * this.edad);
    }

    @Override
    public void registrarVacuna(String nombre) {
    }

    @Override
    public int getVacunasAplicadas() {
        return 0;
    }

    @Override
    public double calcularPrimeSeguro() {
        return 80000 * this.edad;
    }

    @Override
    public String obtenerNumeroPoliza() {
        return "";
    }
}
