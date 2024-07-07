import java.util.Scanner;

public class ConvertirMoneda {

    public static void convertir(String monedaBase, String monedaTarget, ConsultaMoneda consultaMoneda, Scanner teclado) {
        double cantidad;
        double cantidadConvertida;


        Moneda monedas = consultaMoneda.buscaMoneda(monedaBase, monedaTarget);
        System.out.println("Cotización del día\n" + monedaBase + " = " + monedas.conversion_rates() + " " + monedaTarget);
        System.out.println("Ingrese la cantidad de: " + monedaBase);
        cantidad = Double.parseDouble(teclado.nextLine());
        cantidadConvertida = cantidad * monedas.conversion_rates();
        System.out.println(cantidad + " " + monedaBase + "=" + cantidadConvertida + " " + monedas.base_code());
    }

        public static void convertirOtraMoneda (ConsultaMoneda consultaMoneda, Scanner teclado) {
            System.out.println("Ingrese el código de la moneda: ");
            String monedaBase = teclado.nextLine().toUpperCase();
            System.out.println("Ingrese la moneda a convertir: ");
            String mondedaAConvertir = teclado.nextLine().toUpperCase();
            convertir(monedaBase, mondedaAConvertir, consultaMoneda, teclado);

        }
    }

