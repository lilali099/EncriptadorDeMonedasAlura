import java.io.IOException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {



        Scanner teclado = new Scanner(System.in);
        ConsultaMoneda consultaMoneda = new ConsultaMoneda();
        GeneradorDeArchivo generador = new GeneradorDeArchivo();

        int opc = 0;
        while (opc != 0) {
            try {
                System.out.println("************************************\n" +
                        "Bienvenido al conversor de moneda\n\n" +
                        "Ingrese el tipo de moneda que desea convertir\n\n" +
                        "1)Dolar a Peso Argentino\n" +
                        "2) Peso argentino a Dolar\n" +
                        "3)Euro a peso argentino\n" +
                        "4)Peso argentino a Euro\n" +
                        "5)Reales a Peso Argentino\n" +
                        "6)Peso Argentino a Reales\n" +
                        "7)Boliviano a Peso argentino\n" +
                        "8)Peso Argentino a Boliviano\n" +
                        "9)Convertir otra moneda\n" +
                        "10)Finalizar"
                );
                opc = teclado.nextInt();
                teclado.nextLine();

                switch (opc) {
                    case 1:
                        ConvertirMoneda.convertir("ARS", "USD", consultaMoneda, teclado);

                    case 2:
                        ConvertirMoneda.convertir("USD", "ARS", consultaMoneda, teclado);
                    case 3:
                        ConvertirMoneda.convertir("ARS", "EUR", consultaMoneda, teclado);

                    case 4:
                        ConvertirMoneda.convertir("EUR", "ARS", consultaMoneda, teclado);

                    case 5:
                        ConvertirMoneda.convertir("BRL", "ARS", consultaMoneda, teclado);

                    case 6:
                        ConvertirMoneda.convertir("ARS", "BRL", consultaMoneda, teclado);

                    case 7:
                        ConvertirMoneda.convertir("ARS", "BOB ", consultaMoneda, teclado);

                    case 8:
                        ConvertirMoneda.convertir("BOB", "ARS", consultaMoneda, teclado);

                    case 9:
                        ConvertirMoneda.convertirOtraMoneda(consultaMoneda, teclado);
                        break;
                    case 10:
                        System.out.println("Finalizando.....\n" + "................");
                        break;

                    default:
                        System.out.println("Opción no válida");
                }
            }catch (NumberFormatException e){
            System.out.println("Número no encontrado" + e.getMessage());
        }
        catch (RuntimeException e){
            System.out.println(e.getMessage());
            System.out.println("Finalizando la aplicación");
        }

            }


        }


    }
