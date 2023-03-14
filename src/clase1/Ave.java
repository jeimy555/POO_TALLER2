package clase1;

public class Ave extends Animal{


    //atributos
    private String envergadura;
   
    //metodo constructor
    public Ave(){}
    public Ave(String nombre,int edad,String envergadura){
        super(nombre,edad);
        this.envergadura=envergadura;
    }
    //metodos
    public void mostrarAve() {
    System.out.println("el nombre del ave es "+getNombre()+" la envergadura del ave es "+this.envergadura);
        
    }
    public String getEnvergadura() {
        return envergadura;
    }
    public void setEnvergadura(String envergadura) {
        this.envergadura = envergadura;
    }








}
