import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String Capital;
        String Pais;
        System.out.println("Ingrese el país");
        Pais = sc.nextLine();
        System.out.println("Ingrese la capital");
        Capital = sc.nextLine();
        System.out.println(Capital +" es la capital de "+Pais);
    }
}
