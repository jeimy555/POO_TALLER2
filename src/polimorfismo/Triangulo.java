package polimorfismo;

import java.util.Scanner;

public class Triangulo extends Figura {
    static Scanner leer=new Scanner(System.in);
    private float base,altura;

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    @Override
    public void calcularArea() {
        System.out.println("ingrese la medida de la base del triangulo en cm");
        base=leer.nextFloat();
        System.out.println("ingrese la medida de la altura del triangulo en cm");
        altura=leer.nextFloat();
        float area=(base*altura)/2;
        System.out.println("el area del triangulo es "+area);
        
    }
    
    
    
}
