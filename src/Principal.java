public class Principal {
    public static void main (String [] args){
    
        Juegos j1 = new Juegos ("Grand Theft Auto: San Andreas", 2003, "acción", "PlayStation 2");
        Juegos j2 = new Juegos ("Red Dead Redemption 2", 2018, "acción y viejo oeste","PlayStation 4");
        Juegos j3 = new Juegos ("Legend of Zelda: Breath of the Wild", 2018, "acción-aventura","Nintendo Switch");
        Juegos j4 = new Juegos ("Tetris", 1984, "puzzle","Commodore 64");
        Juegos j5 = new Juegos ("The Last of Us", 2013, "acción-aventura y supervivencia de terror","PlayStation 3");
        
        j1.MostrarDatos();
        j2.MostrarDatos();
        j3.MostrarDatos();
        j4.MostrarDatos();
        j5.MostrarDatos();
    }
}
