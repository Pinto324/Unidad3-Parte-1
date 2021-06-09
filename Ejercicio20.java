
import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String No;
        int V1;
        int V2;
        int V3;
        int V4;
        int V5;
        String NoI;
        System.out.println("Escriba un numero de 5 cifras");
        No = sc.nextLine();
        if (No.length()== 5){
        V1 = Integer.valueOf(No.substring(0,1));
        V2 = Integer.valueOf(No.substring(1,2));
        V3 = Integer.valueOf(No.substring(2,3));
        V4 = Integer.valueOf(No.substring(3,4));
        V5 = Integer.valueOf(No.substring(4));
        NoI = Integer.toString(V5)+Integer.toString(V4)+Integer.toString(V3)+Integer.toString(V2)+Integer.toString(V1);
            if(No.equals(NoI)){
            System.out.println("Es capicúa");
            }else{
            System.out.println("No es capicúa");
            }
        
        }else {
        System.out.println("el numero no tiene 5 cifras");
        }   
    }    
}
