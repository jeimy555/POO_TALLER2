package principal;

import salud.People;

public class Inicio {
    public static void main(String[] args) {
        People datos=new People();
        datos.pedirDatos();
        datos.mostrarPersona();

        
        String pesoActual=datos.calcularImc(0, 0);
        if (pesoActual.equals("PESOBAJO")) {
            System.out.println("el peso está por debajo de lo ideal");
        }else 
        if (pesoActual.equals("PESOIDEAL")) {
            System.out.println("el peso es ideal");
        } else if (pesoActual.equals("SOBREPESO")) {
            System.out.println("TIENES SOBREPESO");
        }
        
        
        datos.mayorEdad();

    }
}
