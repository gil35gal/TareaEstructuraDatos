package animales;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.HashSet;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        // 1. Variables de tipos primitivos
        int edad = 3;
        double peso = 12.5;
        char inicial = 'B';
        boolean saludable = true;
        long identificador = 1001L;

        // 2. Variables de tipos no primitivos
        String nombre = "Bobby";
        Integer edadObjeto = 3;

        // 3. Creamos objetos de las clases hijas
        // Las referencias son de tipo Animal (polimorfismo)
        Animal perro = new Perro("Bobby", edad, peso, "Labrador");
        Animal gato = new Gato("Michi", 2, 4.2, true);
        Animal pajaro = new Pajaro("Piolín", 1, 0.5, true);

        // 4. Creamos las colecciones solicitadas
        ArrayList<Animal> animales = new ArrayList<>();
        animales.add(perro);
        animales.add(gato);
        animales.add(pajaro);

        LinkedList<String> actividades = new LinkedList<>();
        actividades.add("Comer");
        actividades.add("Dormir");

        HashSet<String> habilidades = new HashSet<>();
        habilidades.add("Correr");
        habilidades.add("Saltar");
        habilidades.add("Correr"); // HashSet no guarda duplicados

        HashMap<String, String> datos = new HashMap<>();
        datos.put("Lugar", "Casa");
        datos.put("Color", "Café");
        datos.put("Lugar", "Jardín"); // Reemplaza el valor anterior

        // 5. Recorremos la lista y mostramos información
        for (Animal animal : animales) {
            animal.mostrarInformacion();

            // Polimorfismo: cada objeto ejecuta su propio sonido
            animal.hacerSonido();

            System.out.println("--------------------");
        }

        // 6. Probamos getters y setters
        perro.setEdad(4);
        System.out.println("Nueva edad de Bobby: " + perro.getEdad());

        // 7. Mostramos las colecciones
        System.out.println("Actividades: " + actividades);
        System.out.println("Habilidades: " + habilidades);
        System.out.println("Datos: " + datos);

        // 8. Mostramos los tipos de variables
        System.out.println("Edad (int): " + edad);
        System.out.println("Peso (double): " + peso);
        System.out.println("Inicial (char): " + inicial);
        System.out.println("Saludable (boolean): " + saludable);
        System.out.println("Identificador (long): " + identificador);
        System.out.println("Nombre (String): " + nombre);
        System.out.println("Edad objeto (Integer): " + edadObjeto);
    }
}