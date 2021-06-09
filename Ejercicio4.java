
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int Numero;
        System.out.println("Ingrese el numero");
        Numero = sc.nextInt();
        int cua = Numero*Numero;
        int Cubo = Numero*Numero*Numero;
        System.out.println("El cuadrado del numero es: "+cua);
        System.out.println("El cuadrado del numero es: "+Cubo);
    }
}
