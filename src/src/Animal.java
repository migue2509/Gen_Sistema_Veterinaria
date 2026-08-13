abstract class Animal {

    protected String nombre;
    protected int edad;
    protected String nombreDueno;

    // El modificador de acceso es protected porque permite que las clases hijas accedan a ellos
    // mediante los setters y getters

    public Animal(String nombre, int edad, String nombreDueno) {
        this.nombre = nombre;
        this.edad = edad;
        this.nombreDueno = nombreDueno;
    }

    public abstract double precioConsulta();

    public String fichaAnimal() {
        return "Animal: " + nombre
                + " | Edad: " + edad
                + " | Dueño: " + nombreDueno
                + " | Costo Consulta: " + precioConsulta();
    }
}