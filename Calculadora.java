import java.util.Scanner;

public class Calculadora {

     public static void main(String[] args) {

         Scanner consola = new Scanner(System.in);


         while (true) {

             MostrarMenu();
             try {
                 var operacion = Integer.parseInt(consola.nextLine());
                 if (operacion >= 1 && operacion <= 4) {

                     ejecutarOperacion(operacion,consola);

                 } else if (operacion == 5) {
                     System.out.println("Hasta Pronto......");
                     break;
                 } else {

                     System.out.println("Dato erroneo");
                 }

                 System.out.println();
             }catch(Exception e){
                  System.out.println("Ocurrio un errror"+e.getMessage());
             }//fin try
         }//fin while
     }// fin de main

    //Función que muestra el menu
    public static void MostrarMenu(){
        System.out.println("**** Aplicacion Calculadora ****");
        System.out.println("""
                     1. Suma
                     2. Resta
                     3. Multiplicación
                     4. Division
                     5. Salir
                     """);

        System.out.println("Operación a realizar?");
   }

private static void ejecutarOperacion(int operacion, Scanner consola){
    System.out.print("Proporciona valor operando1: ");
    var operando1 = Double.parseDouble(consola.nextLine());
    System.out.print("Proporciona valor operando2: ");
    var operando2 = Double.parseDouble(consola.nextLine());
    double resultado;
    switch (operacion) {
        case 1 -> {
            resultado = operando1 + operando2;
            System.out.println("Resultado es:" + resultado);
        }
        case 2 -> {
            resultado = operando1 - operando2;
            System.out.println("Resultado es:" + resultado);
        }

        case 3 -> {
            resultado = operando1 * operando2;
            System.out.println("Resultado es:" + resultado);
        }
        case 4 -> {
            resultado = (operando1 / operando2);
            System.out.println("Resultado es:" + resultado);
        }

        default -> {
            System.out.println("Dato Erroneo" + operacion);
        }

    }
}

}
