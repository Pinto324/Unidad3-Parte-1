
import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int Base;
        int Altura;
        int Area;
        int Per;
        System.out.println("Ingrese la Base");
        Base = sc.nextInt();
        System.out.println("Ingrese Altura");
        Altura = sc.nextInt();
        Area = Base*Altura;
        Per = (Base*2) + (Altura*2);
        System.out.println("El perimetro es de: "+Per);
        System.out.println("La Area es de: "+Area);
    }    
}
