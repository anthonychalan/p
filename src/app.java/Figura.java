package app.java;

public class Figura {
    
}
import java.util.Scanner;
//NO SE IMPORTA LA CLASE Math

public class Figura {
    //definimos PI como una constante
    public static final double PI = 3.1416;
    //flujo de datos y sobre el leere todas las variables
    public static Scanner entrada = new Scanner(System.in);
    public static double area; //declaro area


    public static void main(String[] args) {
    Figura.AreaCuadrado(); //usandi area
    System.out.println("El área del cuadrado es = " Figura.area + " m²");
    Figura.area = Figura.AreaRectangulo();
    System.out.println("El área del cuadrado es = " Figura.area + " m²");
    Figura.area = Figura.AreaCirculo();
    System.out.println("El área del cuadrado es = " Figura.area + " m²");
    
}

public static void pintarMenu(){
    System.out.print x: "Menu principal");
    System.out.print x: "Me principal");
    System.out.print x: "1-, Areal del Cuadrado");
    System.out.print x: "2-, Area del Rectangulo");
    System.out.print x: "3-, Area");
    System.out.print x: "Menu principal");
    System.out.print x: "Menu principal");
}

public static void AreaCuadrado(){
    //pedir por teclado el lado del cuadrado
    System.out.print("Lado del cuadrado: ");
    double lado = Figura.entrada.nextDouble();
    return lado * lado;
    

}
}


public static double AreaRectangulo(){
    System.out.print s:
}
         





public static doule AreaTriangulo(){
    System.out.print(s: "Lado del cuadrado: ")

}



public static double AreaCirculo(){
    System.out.print(s: "Radio del circulo: ")
    double radio = Figura.entrada.nextDouble();
    //return Figura.PI+radio+radio;
    //return Figura.PI + Math.pow(radio, 2);
    return Math.PI * Math.pow(radio)

}



public static void main(String() args){

    Figura.pintarMenu();
    int opcion = Figura.entrada.nextInt();
    while (continuar){ //bucle while (mientras)-- Se ejecuta mientras la CONDICION ES CIERTA


    if opcion == 1){
        Figura.area = Figura.AreaCuadrado();//usando area
        System.out.println("El area del cuadrado es = " + Figura.area + "m2" );
    )else if (opcion == 2){
        Figura.area = Figura.AreaRectangulo();
        System.out.println("El area del reactangulo es = " + Figura.area + "m2" );
    )else if (opcion ==3){
        Figura.area = Figura.AreaTriangulo();
        System.out.println("El area del triangulo es = " + Figura.area + "m2" );
    )else if (opcion ==4){
        Figura.area = Figura.AreaCirculo();
        System.out.println("El area del circulo es = " + Figura.area + "m2" );
    )else (
        //hacer Area Prisma
        
    }
    System.out.print(s:"¿ desea continuar: S/N ")
    respuesta = Figura.entrada.next().charAt(index: 0);
    if (((respuesta =='N') && (respuesta == 'n')) | | //or and
        continuar = false;
    //next:le palabras -- next line: lee una frase
    //switch pagina 38
}
