package polimorfismo;
import java.util.Scanner;

public class Cuadrado extends Figura {
    static Scanner leer=new Scanner(System.in);
    private double lado;
    //metodfos accesores get y set
    public double getLado() {
        return lado;
    }

    public void setLado (double lado) {
        this.lado = lado;
    }
    //sobreescribir un metiodo
    @Override
    public void calcularArea(){
        System.out.println("ingrese la medida del lado");
        lado=leer.nextDouble();
     double area=lado*lado;
      System.out.println("el lado del cuadrado es "+lado+" el area es "+area);  
    }
}
