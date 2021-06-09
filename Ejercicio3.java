import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int Numero = 0;
        System.out.println("Ingrese el numero");
        Numero = sc.nextInt();
        int Doble = Numero * 2;
        int Triple = Numero * 3;
        System.out.println("El doble del numero es: "+Doble);
        System.out.println("El triple del numero es: "+Triple);
    }
}
