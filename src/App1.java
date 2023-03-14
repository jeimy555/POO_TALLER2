import java.util.Set;

import clase1.Animal;
import clase1.Ave;
import clase1.Movie;

public class App1 {
    public static void main(String[] args) throws Exception {
        Animal tigre =new Animal();
        Movie minions=new Movie(null);
        Movie avatar=new Movie("avatar");
        Ave condorito=new Ave();
        condorito.setNombre("condorito");
        condorito.setEdad(50);
        condorito.setEnvergadura("300cm");
        condorito.mostrarAve();


        avatar.getCategory();
        avatar.getDuration();
        avatar.getName();
        avatar.getYear();
        avatar.setCategory("terror");
        avatar.setDuration(130);
        avatar.setName("barbie");
        avatar.setYear(2005);

        
    }
}
