import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido(a) a Screen Match");
        System.out.println("Película: Matrix");

        int fechaDeLanzamiento = 1999;
        boolean incluidoEnElPlan = true;
        double notaDeLaPelicula = 8.2;

        double media = (8.2 + 6.0 + 9.0) / 3;
        System.out.println(media);

        int valor = 10 ;
        valor += 15;
        System.out.println(valor);
        String sinopsis = """
                Matrix es una paradoja
                La mejor película del fin del milenio
                Fue lanzada en:  
                """.replaceAll("\\s+$", "") + " " + fechaDeLanzamiento;
        System.out.println(sinopsis);

        int clasificacion = (int)media / 2;
        System.out.println(String.format("La clasificación es de: %d",clasificacion));


    }
}

