package animales;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.HashSet;
import java.util.HashMap;

public class Animal {

    // Atributos privados: aplicamos encapsulamiento
    private String nombre;
    private int edad;

    // Atributos protegidos: accesibles desde las clases hijas
    protected String especie;
    protected double peso;

    // Colecciones solicitadas en la tarea
    protected ArrayList<String> vacunas = new ArrayList<>();
    protected LinkedList<String> actividades = new LinkedList<>();
    protected HashSet<String> habilidades = new HashSet<>();
    protected HashMap<String, String> datos = new HashMap<>();

    // Constructor de la clase padre
    public Animal(String nombre, int edad, String especie, double peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.especie = especie;
        this.peso = peso;
    }

    // Getter para obtener el nombre
    public String getNombre() {
        return nombre;
    }

    // Setter para modificar el nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Getter para obtener la edad
    public int getEdad() {
        return edad;
    }

    // Setter para modificar la edad
    public void setEdad(int edad) {
        this.edad = edad;
    }

    // Método que las clases hijas sobrescribirán
    public void hacerSonido() {
        System.out.println("El animal hace un sonido.");
    }

    // Método para mostrar información general
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Especie: " + especie);
        System.out.println("Peso: " + peso + " kg");
    }
}