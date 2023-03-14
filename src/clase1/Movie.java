package clase1;

import java.util.Locale.Category;

public class Movie {
    private String name,category;
    public int duration;
    int year;


    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public int getDuration() {
        return duration;
    }
    public void setDuration(int duration) {
        this.duration = duration;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public Movie (String name){
    this.name=name;
    
    }
public void mostrarPelicula(String name) {
    System.out.println("la pelicula es "+name);
    
}
public void mostrarPelicula(String category, String name) {
    System.out.println("el nombre de la pelicula es "+name+" y su categoria es "+category);
}
public void mostrarPelicula(String name,int duration) {
    System.out.println("la pelicula es "+name+" y tiene una duracion de "+duration);
}
    

}
