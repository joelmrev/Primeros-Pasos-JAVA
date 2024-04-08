import java.util.Scanner;

public class Loops {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double nota = 0;
        double mediaEvaluaciones = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Escribe la nota que le darías a la película Matrix: ");
            nota = teclado.nextDouble();
            mediaEvaluaciones = mediaEvaluaciones + nota;
        }

        double mediaFinal = mediaEvaluaciones / 3;
        System.out.println(String.format("Media de Evaluaciones para Matrix es: %.1f",mediaFinal));
    }
}
