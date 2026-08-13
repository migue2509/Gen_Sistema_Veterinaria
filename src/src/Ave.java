public class Ave extends Animal {
    protected double pesoGramos;

    public Ave(String nombre, int edad, String nombreDueno){
        super(nombre, edad, nombreDueno);
        this.pesoGramos = pesoGramos;
    }

    @Override
    public double precioConsulta() {
        return 28000 + (100 * this.pesoGramos);
    }

}