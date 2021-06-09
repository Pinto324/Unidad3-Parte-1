import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       //Declarando las variables
       int No1;
       int No2;
       int NoF;
       System.out.println("Escriba el primer numero");
       No1 = sc.nextInt();
       System.out.println("Escriba el segundo numero");
       No2 = sc.nextInt();
       NoF = No1 + No2;
       System.out.println("La suma de los numeros es: " + NoF);
    }
}
