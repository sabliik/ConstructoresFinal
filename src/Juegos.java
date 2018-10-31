public class Juegos {
    public String nombre;
    public int año;
    public String genero;
    public String consola;
    
    public Juegos(){
    }
    
    public Juegos (String nombre,int año,String genero, String consola){
        this.nombre = nombre;
        this.año = año;
        this.genero = genero;
        this.consola = consola;
    }
    public void MostrarDatos (){
        System.out.println("Nombre del videojuego: "+nombre);
        System.out.println("género: "+genero);
        System.out.println("año de publicación: "+año);
        System.out.println("consola en que se publicó fue: "+consola);
    }
}
