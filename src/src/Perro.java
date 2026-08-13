import java.util.ArrayList;

public class Perro extends Animal implements Vacunable, Asegurable {
    protected String raza;
    private ArrayList<String> vacunas;

    public Perro(String nombre, int edad, String nombreDueno, String raza){
        super(nombre, edad, nombreDueno);
        this.raza = raza;
        vacunas = new ArrayList<>();
    }

    @Override
    public double precioConsulta() {
        return 45000 + (3000 * this.edad);
    }

    @Override
    public void registrarVacuna(String nombre) {
        vacunas.add(nombre);
    }

    @Override
    public int getVacunasAplicadas() {
        return vacunas.size();
    }

    @Override
    public double calcularPrimeSeguro() {
        return 80000 * this.edad;
    }

    @Override
    public String obtenerNumeroPoliza() {
        return "POL-PERRO-"+this.nombre.toUpperCase();
    }
}
