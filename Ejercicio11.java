
import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double cm;
        double M;
        double Yard;
        double Pie;
        double Pulg;
        System.out.println("Ingrese la cantidad en centimetros");
        cm = sc.nextInt();
        M = cm/100;
        Pulg = cm/2.54;
        Pie = cm/30.48;
        Yard = cm/91.44;
        System.out.println("El valor en metros es: "+M);
        System.out.println("El valor en pulgadas es: "+Pulg);
        System.out.println("El valor en pies es: "+Pie);
        System.out.println("El valor en yardas es: "+Yard);
    }    
}
