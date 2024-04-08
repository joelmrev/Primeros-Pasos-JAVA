import java.sql.SQLOutput;
import java.util.Scanner;

public class PrimeraClase  {
    public static void main(String[] args) {
        System.out.println("Concluí el aula 01 y ahora estoy sumergiéndome en Java");

        String saludo = "Hola, ";
        String nombre = "Alura";
        String mensaje = saludo + nombre + "!";
        System.out.println(mensaje);

        String contrasena = "12345";
        if (contrasena.equals("12345")) {
            System.out.println("Acceso Autorizado!");
        } else {
            System.out.println("Contraseña incorrecta.");
        }

//        String nombre = "Maria";
//        int edad = 30;
//        double valor = 55.9999;
//        System.out.println(String.format("Mi nombre es %s, tengo %d años y hoy gasté %.2f dolares", nombre, edad, valor));

        String nombre1 = "Juan";
        int aulas = 4;

        String mensaje1= """
                  Hola, %s!
                  Bienvenido al curso de Java.
                  Tendremos %d aulas para mostrarte lo que es necesario para que puedas dar tu primeros pasos en este lenguaje
                  """.formatted(nombre1, aulas);

        System.out.println(mensaje1);

//        int x = 10;
//        double y = x; // casting implícito
//        System.out.println(y);

        double x = 10.5;
        int y = (int) x; // casting explícito
        System.out.println(y);

        double x1 = 15.6;
        float y1 = (float)x1;
        System.out.println(y1);

        byte valoMini = 99;
        System.out.println(valoMini);

        // EJERCICIO CONVERSIÓN: GRADOS CELSIUS A GRADOS FAHRENHEIT
        double gradosCelsius = 45.5;
        double gradosFahrenheit = (gradosCelsius * 1.8) + 32;
        System.out.println(String.format("Grados Fahrenheit: %.2f°",gradosFahrenheit));
        int temperaturaFahrenheit = (int) gradosFahrenheit;
        System.out.println(String.format("Grados Fahrenheit (entero): %d°",temperaturaFahrenheit));

        // EJEMPLO SWITCH CASE
//        switch (expresion) {
//            case valor1:
//                // código a ejecutar si la expresión es igual a valor1
//                break;
//            case valor2:
//                // código a ejecutar si la expresión es igual a valor2
//                break;
//            // otros casos posibles...
//            default:
//                // código a ejecutar si ninguno de los casos anteriores se cumple
//        }

        int dia = 3;
        switch (dia) {
            case 1:
                System.out.println("El día 1 es lunes");
                break;
            case 2:
                System.out.println("El día 2 es martes");
                break;
            case 3:
                System.out.println("El día 3 es miércoles");
                break;
            // otros casos posibles...
            default:
                System.out.println("Día no válido");
        }

        // EJEMPLO USO CLASE SCANNER
//        Scanner teclado = new Scanner(System.in);
//        System.out.println("Ingresa tu Nombre: ");
//        String nombre = teclado.nextLine();
//        System.out.println("Ingresa tu edad: ");
//        int edad = teclado.nextInt();
//        System.out.println("Ingresa tu altura: ");
//        double altura = teclado.nextDouble();
//
//        String Datos = """
//                Nombre: %s
//                Edad: %d
//                Altura: %.2f
//                """.formatted(nombre,edad,altura);
//        System.out.println(Datos);


//EJEMPLO 2 USO CLASE SCANNER
//                Scanner scanner = new Scanner(System.in);
//
//                System.out.print("Digite seu nome: ");
//                String nome = scanner.nextLine();
//                System.out.print("Digite sua idade: ");
//                int idade = scanner.nextInt();
//                System.out.print("Digite o valor que pretende investir esse mês: ");
//                double valor = scanner.nextDouble();
//
//                System.out.println(nome + " que tem " + idade + " anos, irá investir R$ " + valor + " esse mês.");
//
//                scanner.close();

//        EJEMPLO DE PRÁCTICA PARA USO DEL CICLO WHILE

            }
        }

