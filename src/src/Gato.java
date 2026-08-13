public class Gato extends Animal implements Vacunable, Asegurable{
    protected boolean esEsterilizado;

    public Gato(String nombre, int edad, String nombreDueno){
        super(nombre, edad, nombreDueno);
        this.esEsterilizado = esEsterilizado;
    }

    @Override
    public double precioConsulta() {
        return 38000;
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
