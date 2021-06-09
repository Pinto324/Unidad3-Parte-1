
import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String No;
        int V1;
        int V2;
        int V3;
        int V4;
        int Suma;
        System.out.println("Escriba u numero de 4 cifras");
        No = sc.nextLine();
        if (No.length()== 4){
        V1 = Integer.valueOf(No.substring(0,1));
        V2 = Integer.valueOf(No.substring(1,2));
        V3 = Integer.valueOf(No.substring(2,3));
        V4 = Integer.valueOf(No.substring(3));
        Suma = V1+V2+V3+V4;
        System.out.println("El primer digito es: "+V1);
        System.out.println("El segundo digito es: "+V2);
        System.out.println("El tercer digito es: "+V3);
        System.out.println("El cuarto digito es: "+V4);
        System.out.println("La suma de los valores es: "+Suma);
        }else {
        System.out.println("el numero no tiene 4 cifras");
        }   
    }      
}
