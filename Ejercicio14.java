
import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int No1 = 0;
        int No2 = 0;
        System.out.println("Ingrese los 2 numeros");
        No1 = sc.nextInt();
        No2 = sc.nextInt();
        if (No1  % No2 == 0){
        System.out.println("Es Divisible");
        }else {
        System.out.println("No es Divisible");
        }
    }    
}
