package arrays;
import java.util.Random;


public class personaAleatoria  {

    public static void main(String[] args) {
        // Lista de personas
        String[] personas = {"Ana", "Juan", "Jose", "Maria", "Noelia"};
        
        // Crear un generador de números aleatorios
        Random random = new Random();
        
        // Array para contar cuántas veces ha sido seleccionado cada nombre
        int[] contador = new int[personas.length];
        
        // Realizamos 10 tiradas
        for (int i = 0; i < 10; i++) {
            // Generar un número aleatorio entre 0 y 4 (porque hay 5 personas)
            int tirada = random.nextInt(personas.length);
            
            // Mostrar el resultado de la tirada (número y nombre)
            System.out.println("Tirada " + (i + 1) + " --- [" + tirada + "] ---> " + personas[tirada]);
            
            // Incrementar el contador de la persona seleccionada
            contador[tirada]++;
        }
        
        // Encontrar la persona con más tiradas
        int maxTiradas = 0;
        String personaGanadora = "";
        
        for (int i = 0; i < contador.length; i++) {
            if (contador[i] > maxTiradas) {
                maxTiradas = contador[i];
                personaGanadora = personas[i];
            }
        }
        
        // Mostrar la persona ganadora
        System.out.println("\nLa persona que ha sido seleccionada más veces es: " + personaGanadora + " con " + maxTiradas + " tiradas.");
    }
}



