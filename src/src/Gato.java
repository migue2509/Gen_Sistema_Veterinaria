import java.util.ArrayList;

public class Gato extends Animal implements Vacunable, Asegurable{
    protected boolean esEsterilizado;
    private ArrayList<String> vacunas;

    public Gato(String nombre, int edad, String nombreDueno, boolean esEsterilizado){
        super(nombre, edad, nombreDueno);
        this.esEsterilizado = esEsterilizado;
        vacunas = new ArrayList<>();
    }

    @Override
    public double precioConsulta() {
        return 38000;
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
        if(this.esEsterilizado){
            return  120000;
        }
        else{
            return 200000;
        }
    }

    @Override
    public String obtenerNumeroPoliza() {
        return "";
    }
}
