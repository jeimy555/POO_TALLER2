package salud;

import java.util.Scanner;

import javax.print.DocFlavor.READER;

public class People {
    public String nombre,tipDoc, apellido,sexo;
    public int peso,estatura;
    public int pesoActual,documento,edad;
    Scanner leer=new Scanner(System.in);
    
    public void pedirDatos() {
        System.out.println("ingrese su tipo de documento");
        tipDoc=leer.nextLine();
        System.out.println("ingrese su numero de documento");
        documento=leer.nextInt();
        System.out.println("ingrese su nombre");
        nombre=leer.next();
        System.out.println("ingrese su apellido");
        apellido=leer.next();
        System.out.println("ingrese su peso");
        peso=leer.nextInt();
        System.out.println("ingrese su estatura");
        estatura=leer.nextInt();
        System.out.println("ingrese su edad");
        edad=leer.nextInt();
        System.out.println("ingrese su genero");
        sexo=leer.next();
        }
    public void mostrarPersona() {
        System.out.println("sus datos ingresados son:");
        System.out.println("tipo de documento: "+tipDoc);
        System.out.println("numero de documento: "+documento);
        System.out.println("nombre: "+nombre);
        System.out.println("apellido: "+apellido);
        System.out.println("peso: "+peso);
        System.out.println("estatura: "+estatura);
        System.out.println("edad: "+edad);
        System.out.println("genero: "+sexo);
            
        }
    public String calcularImc(int peso,int estatura) {
        pesoActual=(peso/(estatura^2));
        String rta="";
        if (pesoActual<20) {
          rta= "PESOBAJO";  
            
        } else
        if (pesoActual>=20 || pesoActual<=25) {
          rta= "PESOIDEAL";  
            
        }else 
        if (pesoActual>25) {
          rta= "SOBREPESO"; 
            
        }
        return rta;


        

        
    }
    public void mayorEdad() {
        if (edad>=18) {
            System.out.println("usted es mayor de edad");
            
        }else{System.out.println("usted es menor de edad");}
        
    }
        
    
}
