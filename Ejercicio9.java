import java.util.Scanner;
public class Ejercicio9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String A;
        String B;
        String C;
        System.out.println("Ingrese el contenido de A:");
        A = sc.nextLine();
        System.out.println("Ingrese el contenido de B:");
        B = sc.nextLine(); 
        C = A;
        A = B;
        B = C;
        System.out.println("El valor de A ahora es de: "+A);
        System.out.println("El valor de B ahora es de: "+B);
    }
}
