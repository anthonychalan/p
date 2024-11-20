
import java.util.Scanner;

public class lectura {
    public static void main(String[] args) throws Exception {
        // en la var, cadena almacena la lectura por consola
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce tu nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Introduce tu edad: ");
        int edad = Integer.parseInt(sc.nextLine());
        System.out.println("Te llamas " + nombre + " y tienes " + edad + " años");
        // llamar o invocar al método estático esMayor()
        Lectura.esMayor(edad);
    }
public static void esMayor(int edad){
    //metodo estatico de clases Lectura y para saber si es o no mayor de edad
    //una clase estatica todos su metodos y propiedades llevan el prefijo estatic y sobre esa clase no se puede 
    //crear con el mteodo niu
}
    if (edad >= 18){
        System.out.println("con la edad de" + edad + "años eres mayor de edad" );
        System.out.println("con la edad de" + edad + "años eres menor de edad" );
 
}

public static void getAnioNac(int edad){
    int anio = 2024 - edad;
    System.out.println("Naciste en el año" + anio);

}





public static class Persona
{
    Scanner sc = new Scanner(System.in);
    System.out.println("Nombre persona 1" );
    System.out.println("edad 1" );
    System.out.println("Nombre persona 2" );
    System.out.printlni("edad 2" );
    
}

    public static void CompararEdades()
    {
        if (Edad1 > Edad2)

}




//hacer un nuevo documento como persona.java 1
using System;

public class Persona
{
    public string Nombre { get; set; }
    public int Edad { get; set; }

    public Persona(string nombre, int edad)
    {
        Nombre = nombre;
        Edad = edad;
    }

    public void CompararEdad(Persona otraPersona)
    {
        if (Edad > otraPersona.Edad)
        {
            Console.WriteLine($"{Nombre} es mayor que {otraPersona.Nombre}.");
        }
        else if (Edad < otraPersona.Edad)
        {
            Console.WriteLine($"{otraPersona.Nombre} es mayor que {Nombre}.");
        }
        else
        {
            Console.WriteLine($"{Nombre} y {otraPersona.Nombre} tienen la misma edad.");
        }
    }

    public string RestarNombre(string nombreARestar)
    {
        return Nombre.Replace(nombreARestar, "").Trim();
    }
}

class Program
{
    static void Main(string[] args)
    {
        Persona persona1 = new Persona("Juan", 25);
        Persona persona2 = new Persona("Maria", 30);

        // Comparar edades
        persona1.CompararEdad(persona2);
        
        // Restar nombres
        string nombreRestado = persona1.RestarNombre("Juan");
        Console.WriteLine($"Nombre después de la resta: '{nombreRestado}'");
    }
}
public static void quienesMayor (int el, int e2, String n1, String n1,String n2){
    if (el > e2){
        System.out.println(n1 + " es mayor que " + n2);
    )else if (e1 == e2))   
    }
}

persona.nombre1 = entrada.nextLine();
nombre1 = entrada.nextLine();


