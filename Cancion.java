public class Cancion extends SubGenero{
    String nombreCancion;
    //CONSTRUCTOR
    public  Cancion (String nombre, String estilo, String nombreCancion){
        super(nombre,estilo);
        this.nombreCancion=nombreCancion;
    }
     //GETTERS

    public String getNombreCancion(){
        return nombreCancion;
    }
    //SETTERS
    public void setNombreCancion(String nombreCancion){
        this.nombreCancion=nombreCancion;

    }
}
