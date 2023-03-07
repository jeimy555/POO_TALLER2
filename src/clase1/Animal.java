package clase1;

import java.util.Scanner;

public class Animal{
//atributos
private String nombre;
public int edad;
 
Scanner leer=new Scanner(System.in);

//metodos
public void registrarAnimal() {
    //cuerpo metodo
    System.out.println("ingrese el nombre del animal");
    nombre=leer.next();
    System.out.println("ingrese la edad del animal");
    edad=leer.nextInt();
    
}
public void mostrarAnimal() {
    System.out.println("el nombre del animal ingresado es "+nombre+" y tiene "+edad+" años de edad");
    
}


}