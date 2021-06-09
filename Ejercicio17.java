
import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int No1;
        int No2;
        int No3;
        System.out.println("Escriba los 3 lados del triangulo");
        No1 = sc.nextInt();
        No2 = sc.nextInt();
        No3 = sc.nextInt();
        if (No1 == No2 && No1 == No3){
        System.out.println("El triangulo es equilatero");
        }else if(No1 == No2 | No2 == No3| No1 == No3&& No1>No2|No2>No3|No3>No2|No2>No1){
        System.out.println("El trinagulo es Isóceles");
        }else if(No3 != No1 && No3 != No2){
        System.out.println("El trinagulo es Escaleno");
        }else {
        System.out.println("hubo un error de calculo");
        }   
    }    
}
