package polimorfismo;

import java.util.Scanner;

public class Circulo extends Figura {
   static Scanner leer=new Scanner(System.in);
    double radio;
     public double getRadio() {
        return radio;
     }
     public void setRadio(double radio){
        this.radio = radio;
     }
     @Override
     public void calcularArea() {
      System.out.println("ingrese el radio del circulo ");
      radio=leer.nextDouble();
        double area=Math.PI*Math.pow(radio, 2);
        System.out.println("el area del circulo es "+area);
        
     }
    
}
