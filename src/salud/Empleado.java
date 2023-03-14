package salud;

public class Empleado extends People{
    private String cargo,departamento;
    private int valorHora,horasTrabajadas;

    public String getCargo() {
        return cargo;
    }
    public String getDepartamento() {
        return departamento;
    }
    public int getValorHora() {
        return valorHora;
    }
    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }
    public void setCargo(String cargo) {
        this.cargo=cargo;
    }
    public void setDepartamento(String departamento) {
        this.departamento=departamento;
    }
    public void setvalorHora(int valorHora) {
        this.valorHora=valorHora;
    }
    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas=horasTrabajadas;
    }

    public void calcularhorarios() {
        
    }


    
    
}
