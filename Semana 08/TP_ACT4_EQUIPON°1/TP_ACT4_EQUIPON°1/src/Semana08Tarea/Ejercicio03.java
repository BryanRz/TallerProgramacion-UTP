package Semana08Tarea;
import java.util.Scanner;
public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // ENTRADA
        String color, ganador = null;
        int votceleste = 0, votmorado = 0, votturquesa = 0;
        // PROCESO
        System.out.println("Elige un color para la campa�a publicitaria (celeste, morado, turquesa)");
        for (int i = 1; i <= 10; i++) {
            System.out.println(String.format("Voto %d:", i));
            color = scan.next();
            switch (color.toLowerCase()) {
                case "celeste":
                    votceleste++;
                    break;
                case "morado":
                    votmorado++;
                    break;
                case "turquesa":
                    votturquesa++;
                    break;
                default:
                    System.out.println("El color que ingres� no es v�lido, int�ntelo de nuevo");
                    i--;
                    break;
            }
        }
        if (votceleste > votmorado) {
            if (votceleste > votturquesa) {
                ganador = "celeste";
            }
        } else {
            if (votmorado > votceleste) {
                if (votmorado > votturquesa) {
                    ganador = "morado";
                }
            } else {
                ganador = "turquesa";
            }
        }
        // SALIDA
        System.out.println(String.format("Celeste tuvo %d votos, y un porcentaje de: %d%%", votceleste, (votceleste * 100) / 10));
        System.out.println(String.format("Morado tuvo %d votos, y un porcentaje de: %d%%", votmorado, (votmorado * 100) / 10));
        System.out.println(String.format("Turquesa tuvo %d votos, y un porcentaje de: %d%%", votturquesa, (votturquesa * 100) / 10));
        System.out.println(String.format("El color ganador es: %s", ganador));
    }
}