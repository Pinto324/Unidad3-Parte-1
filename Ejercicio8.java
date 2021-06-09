import java.util.Scanner;
public class Ejercicio8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int No1;
        int No2;
        int No3;
        System.out.println("Ingrese los tres numeros:");
        No1 = sc.nextInt();
        No2 = sc.nextInt();
        No3 = sc.nextInt();
        int Prom = (No1+No2+No3)/3;
        System.out.println("El promedio es de: "+Prom);
    }
}
