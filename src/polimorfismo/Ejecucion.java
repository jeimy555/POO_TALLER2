package polimorfismo;

import java.util.Scanner;

public class Ejecucion {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        Rectangulo prueba1=new Rectangulo();
        Triangulo prueba2=new Triangulo();
        Circulo prueba3=new Circulo();
        int op,op2;
        op=0;
        do {
            System.out.println("desea hallar el area de un; 1 cuadrado 2 triangulo 3 circulo");
        op=leer.nextInt();switch (op) {
            case 1:
            prueba1.calcularArea();
            
                break;
            case 2:
            prueba2.calcularArea();


            break;
            case 3:
            prueba3.calcularArea();
            break;
        
            default:
                break;
        }
        System.out.println("desea hallar el area de otra figura 1 si 2 no");
            op2=leer.nextInt();
            
        } while (op2==1);
        
        
          
            
            
            
            
    }        
            
           
    
}
