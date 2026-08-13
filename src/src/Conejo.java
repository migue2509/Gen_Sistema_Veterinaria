import java.util.ArrayList;

public class Conejo extends Animal{

    public Conejo(String nombre, int edad, String nombreDueno){
        super(nombre, edad, nombreDueno);

    }

    @Override
    public double precioConsulta() {
        return 35000;
    }
}
