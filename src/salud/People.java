package salud;

import java.util.Scanner;

public class People {
  Scanner leer=new Scanner(System.in);
    private String nombre,tipDoc, apellido,sexo;
    private int peso,estatura;
    private int pesoActual,documento,edad;
    
    
    
    public Scanner getLeer() {
      return leer;
    }

    public void setLeer(Scanner leer) {
    this.leer = leer;
    }
    public String getNombre() {
       
      return nombre;
    }
    public void setNombre(String nombre) {
    this.nombre = nombre;
    }
    public String getTipDoc() 
    {
        return tipDoc;
    }
    public void setTipDoc(String tipDoc) {
    this.tipDoc = tipDoc;
    }
    public String getApellido() {
       return apellido;
    }
    public void setApellido(String apellido) {
       this.apellido = apellido;
    }
    public String getSexo() {
     return sexo;
    }
    public void setSexo(String sexo) {
      this.sexo = sexo;
    }
    public int getPeso() {
      return peso;
    }
    public void setPeso(int peso) {
      this.peso = peso;
    }
    public int getEstatura() {
      return estatura;
    }
    public void setEstatura(int estatura) {
      this.estatura = estatura;
    }
    public int getPesoActual() {
      return pesoActual;
    }
    public void setPesoActual(int pesoActual) {
      this.pesoActual = pesoActual;
    }
    public int getDocumento() {
      return documento;
    }
    public void setDocumento(int documento) {
      this.documento = documento;
    }
    public int getEdad() {
      return edad;
    }
    public void setEdad(int edad) {
      this.edad = edad;
    }
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
