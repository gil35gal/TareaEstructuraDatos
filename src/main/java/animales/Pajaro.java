package animales;

// Pajaro hereda los atributos y métodos de Animal
public class Pajaro extends Animal {

    // Atributo propio de la clase Pajaro
    private boolean puedeVolar;

    // Constructor de Pajaro
    public Pajaro(String nombre, int edad, double peso, boolean puedeVolar) {
        // Llama al constructor de la clase padre
        super(nombre, edad, "Pájaro", peso);
        this.puedeVolar = puedeVolar;
    }

    // Getter: permite consultar si puede volar
    public boolean isPuedeVolar() {
        return puedeVolar;
    }

    // Setter: permite modificar si puede volar
    public void setPuedeVolar(boolean puedeVolar) {
        this.puedeVolar = puedeVolar;
    }

    // Sobrescribe el método hacerSonido() de Animal
    @Override
    public void hacerSonido() {
        System.out.println("Pío, pío");
    }

    // Método propio de Pajaro
    public void volar() {
        if (puedeVolar) {
            System.out.println(getNombre() + " está volando.");
        } else {
            System.out.println(getNombre() + " no puede volar.");
        }
    }
}