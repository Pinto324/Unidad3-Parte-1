public class Ejercicio7 {
    public static void main(String[] args){
        int No;
        No = (int) Math.round((Math.random()*50)+10);
        System.out.println("El numero seleccionado es: "+No);
        double Calc = No - (No*0.15);
        System.out.println("El numero disminuido en 15% es: "+Calc);
    }
}
