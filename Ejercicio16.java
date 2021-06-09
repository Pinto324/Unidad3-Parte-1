
import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int No1;
        int No2;
        int No3;
        System.out.println("Ingrese los 3 numeros");
        No1 = sc.nextInt();
        No2 = sc.nextInt();
        No3 = sc.nextInt();
        if (No1 > No2&& No1> No3){
        System.out.println("El numero mayor es: "+No1);
        }else if(No2 > No1&& No2> No3){
        System.out.println("El numero mayor es: "+No2);
        }else if(No3 > No1&& No3> No2){
        System.out.println("El numero mayor es: "+No3);
        }else {
        System.out.println("hay 2 o más numeros que se repiten");
        }   
    }     
}
