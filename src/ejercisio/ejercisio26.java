import java.util.Scanner;

public class ejercisio26 {
    // Constantes
    private static final double PRECIO_BASE = 8.0;
    private static final double PRECIO_MIERCOLES = 5.0;
    private static final double PRECIO_JUEVES_PAREJA = 11.0;
    private static final double DESCUENTO_CINECAMPA = 0.10; // 10%

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Venta de entradas CineCampa");
        System.out.print("Número de entradas: ");
        int numEntradas = scanner.nextInt();
        scanner.nextLine();  // Limpiar el buffer

        System.out.print("Día de la semana: ");
        String diaSemana = scanner.nextLine().toLowerCase();

        System.out.print("¿Tiene tarjeta CineCampa? (s/n): ");
        char tieneTarjeta = scanner.nextLine().charAt(0);

        double precioTotal = 0.0;
        double descuento = 0.0;
        int entradasIndividuales = 0;
        int entradasParejas = 0;

        switch (diaSemana) {
            case "miércoles":
                precioTotal = numEntradas * PRECIO_MIERCOLES;
                entradasIndividuales = numEntradas;
                break;
            case "jueves":
                entradasParejas = numEntradas / 2;
                entradasIndividuales = numEntradas % 2;
                precioTotal = (entradasParejas * PRECIO_JUEVES_PAREJA) + (entradasIndividuales * PRECIO_BASE);
                break;
            default:
                precioTotal = numEntradas * PRECIO_BASE;
                entradasIndividuales = numEntradas;
                break;
        }

        if (tieneTarjeta == 's' || tieneTarjeta == 'S') {
            descuento = precioTotal * DESCUENTO_CINECAMPA;
            precioTotal -= descuento;
        }

        // Mostrar resultado
        System.out.println("Aquí tiene sus entradas. Gracias por su compra.");
        if (entradasParejas > 0) {
            System.out.printf("Entradas de parejas: %d%n", entradasParejas);
            System.out.printf("Precio por entrada de pareja: %.2f €%n", PRECIO_JUEVES_PAREJA);
        }
        if (entradasIndividuales > 0) {
            System.out.printf("Entradas individuales: %d%n", entradasIndividuales);
            System.out.printf("Precio por entrada individual: %.2f €%n", PRECIO_BASE);
        }
        System.out.printf("Total: %.2f €%n", precioTotal + descuento);
        System.out.printf("Descuento: %.2f €%n", descuento);
        System.out.printf("A pagar: %.2f €%n", precioTotal);

        scanner.close();
    }
}