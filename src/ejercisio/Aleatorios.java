package ejercisio;

public class Aleatorios {


}
//Ejercicio 2
//Realiza un programa que muestre al azar el nombre de una carta de la baraja
//francesa. Esta baraja está dividida en cuatro palos: picas, corazones, diamantes
//y tréboles. Cada palo está formado por 13 cartas, de las cuales 9 cartas son
//numerales y 4 literales: 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K y A (que sería el
//1). Para convertir un número en una cadena de caracteres podemos usar
//String.valueOf(n).

// como se hace una media 


//Ejercicio 5
// 50 números enteros aleatorios entre 100 y 199 (ambos incluidos)
//separados por espacios. Muestra también el máximo, el mínimo y la media
//de esos números.

//Ejercicio 6

//Escribe un programa que piense un número al azar entre 0 y 100. El usuario de-
//be adivinarlo y tiene para ello 5 oportunidades. Después de cada intento fallido,

//el programa dirá cuántas oportunidades quedan y si el número introducido es
//menor o mayor que el número secreto.

//Ejercicio 7
//Escribe un programa que muestre tres apuestas de la quiniela en tres columnas
//para los 14 partidos y el pleno al quince (15 filas).


//Ejercicio 9
//Realiza un programa que vaya generando números aleatorios pares entre 0
//y 100 y que no termine de generar números hasta que no saque el 24. El
//programa deberá decir al final cuántos números se han generado.



public static void main(String[] args); 
import java.util.Random;

public class Aleatorios {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numeros = new int[50];
        int suma = 0;
        int maximo = Integer.MIN_VALUE;
        int minimo = Integer.MAX_VALUE;

        // Generar 50 números aleatorios
        for (int i = 0; i < 50; i++) {
            numeros[i] = random.nextInt(100) + 100; // Números entre 100 y 199
            suma += numeros[i];
            if (numeros[i] > maximo) {
                maximo = numeros[i];
            }
            if (numeros[i] < minimo) {
                minimo = numeros[i];
            }
        }

        // Mostrar los números
        for (int num : numeros) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Calcular y mostrar el promedio
        double media = (double) suma / numeros.length;

        // Mostrar resultados
        System.out.println("Máximo: " + maximo);
        System.out.println("Mínimo: " + minimo);
        System.out.printf("Media: %.2f%n", media);
    }
}


