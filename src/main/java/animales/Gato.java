package animales;

// Gato hereda los atributos y métodos de Animal
public class Gato extends Animal {

    // Atributo propio de la clase Gato
    private boolean domestico;

    // Constructor de Gato
    public Gato(String nombre, int edad, double peso, boolean domestico) {
        // Llama al constructor de la clase padre
        super(nombre, edad, "Gato", peso);
        this.domestico = domestico;
    }

    // Getter: permite consultar si es doméstico
    public boolean isDomestico() {
        return domestico;
    }

    // Setter: permite modificar si es doméstico
    public void setDomestico(boolean domestico) {
        this.domestico = domestico;
    }

    // Sobrescribe el método hacerSonido() de Animal
    @Override
    public void hacerSonido() {
        System.out.println("Miau");
    }

    // Método propio de Gato
    public void trepar() {
        System.out.println(getNombre() + " está trepando.");
    }
}