
import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int Radio;
        int Altura;
        double Vol;
        System.out.println("Ingrese el radio");
        Radio = sc.nextInt();
        System.out.println("Ingrese Altura");
        Altura = sc.nextInt();
        if(Altura > 0 && Radio > 0){
        Vol = 3.1416*(Radio*Radio)*Altura;
        System.out.println("El volumen es de: "+Vol);
        }else{
        System.out.println("No se puede calcular con un valor negativo o nulo");        
        }
    }    
}
