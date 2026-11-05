package animales;

// Perro hereda los atributos y métodos de Animal
public class Perro extends Animal {

    // Atributo propio de la clase Perro
    private String raza;

    // Constructor de Perro
    public Perro(String nombre, int edad, double peso, String raza) {
        // Llama al constructor de la clase padre
        super(nombre, edad, "Perro", peso);
        this.raza = raza;
    }

    // Getter: permite consultar la raza
    public String getRaza() {
        return raza;
    }

    // Setter: permite modificar la raza
    public void setRaza(String raza) {
        this.raza = raza;
    }

    // Sobrescribe el método hacerSonido() de Animal
    @Override
    public void hacerSonido() {
        System.out.println("Guau, guau");
    }

    // Método propio de Perro
    public void traerPelota() {
        System.out.println(getNombre() + " está trayendo la pelota.");
    }
}