package clase1;

import java.util.Scanner;

public class Animal{
//atributos
private String nombre;
public int edad;
private String tipo;

//metodo accesor
public int getEdad(){
    return edad;
}
public void setEdad(int edad){
    this.edad=edad;
}

public String getNombre() {
    return nombre;
}
public void setNombre(String nombre) {
    this.nombre = nombre;
}
//metodo constructor
public Animal(){//constructor vacio o por defecto

}
public Animal (String tipo,String nombre){}

public Animal(String nombre,int edad){
this.nombre=nombre;
this.edad=edad;

}
 
Scanner leer=new Scanner(System.in);

//metodos u operaciones




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