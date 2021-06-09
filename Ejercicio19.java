
public class Ejercicio19 {
    public static void main(String[] args){
        int No;
        No = (int) Math.round((Math.random()*1000)+1);
        System.out.println("El numero seleccionado es: "+No);
        if(No <= 25){
            if(25 % No == 0){
            System.out.println("Correcto");    
            }else{
            System.out.println("Incorrecto");  
            }
        }else{
        System.out.println("Vuelve a intentarlo");
        }    
    }
}
