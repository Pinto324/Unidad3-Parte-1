public class Ejercicio6 {
    public static void main(String[] args){
    int No;
    No = (int) Math.round(Math.random()*200);
    System.out.println("El numero seleccionado es: "+No);
    double Calc = No + (No*0.3);
    System.out.println("El numero aumentado en 30% es: "+Calc);
    }
}
