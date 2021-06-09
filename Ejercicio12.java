import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double temp = 0;
        double far = 0;
        System.out.println("Ingrese la temperatura en celsius");
        temp = sc.nextInt();
        far = (temp * 9/5) + 32;
        System.out.println("El temperatura en farenheit es: "+far);
    }    
}
