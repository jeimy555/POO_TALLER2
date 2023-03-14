package clase1;

public class Prueba {
    public static void main(String[] args) {
        Animal guacamayo=new Animal();
        Movie titanic=new Movie("");
        Animal panda=new Animal("Bambu", 10);
        Movie up=new Movie("up");
        Movie laNocheDelDemonio=new Movie("la noche del demonio");
        
        panda.mostrarAnimal();
        guacamayo.registrarAnimal();
        guacamayo.mostrarAnimal();
        
        
    }
    
}
