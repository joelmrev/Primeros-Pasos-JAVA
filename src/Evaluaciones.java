import java.util.Scanner;

public class Evaluaciones {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
//        double nota = 0;
//        double mediaEvaluaciones = 0;
//        int i = 0;
        double numeroPositivo = 0;
        int i = 0;
        double suma = 0;

        while (numeroPositivo >= 0) {
            System.out.println("Ingresa un número positivo: ");
            numeroPositivo = teclado.nextDouble();
            if (numeroPositivo >= 0) {
                suma += numeroPositivo;
                i++;
            }
        }
        System.out.println(String.format("La suma total es: %.2f",suma));
        System.out.println("Cantidad de números ingresados: " + i);

//        while (nota != -1) {
//            System.out.println("Escribe la nota que le darías a la película Matrix: ");
//            nota = teclado.nextDouble();
//            if (nota != -1) {
//                mediaEvaluaciones += nota;
//                i++;
//            }
//        }
//        double mediaFinal = mediaEvaluaciones / i;
//        System.out.println(String.format("Media de Evaluaciones para Matrix es: %.1f",mediaFinal));
//        System.out.println(i);
    }
}
