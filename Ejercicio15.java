
import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int No = 0;
        System.out.println("Ingrese el numero");
        No = sc.nextInt();
        if (No >= 0){
            if(No == 0){
            System.out.println("Es Nulo");
            }else{
            System.out.println("Es Positivo");
            }
        }else {
        System.out.println("Es Negativo");
        }
    }       
}
