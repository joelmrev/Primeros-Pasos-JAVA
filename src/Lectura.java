import java.util.Scanner;

public class Lectura {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe el nombre de tu película favorita: ");
        String pelicula = teclado.nextLine();
        System.out.println("Ahora, escribe la fecha de lanzamiento: ");
        int fechaDeLanzamiento = teclado.nextInt();
        System.out.println("Dinos que nota le das a esta película: ");
        double nota = teclado.nextDouble();

        String DatosDePelicula = """
                Película: %s
                Fecha de Lanzamiento: %d
                Nota: %.1f
                """.formatted(pelicula,fechaDeLanzamiento,nota);

        System.out.println(DatosDePelicula);

    }
}
