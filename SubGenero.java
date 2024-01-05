public class SubGenero extends GeneroMusical{
    String estilo;

    //CONSTRUCTOR
    public SubGenero(String nombre, String estilo){
        super(nombre);
        this.estilo=estilo;
    }

    //GETTERS
    public String getEstilo(){
        return estilo;
    }

    //SETTERS;

    public void setEstilo(String estilo){
        this.estilo=estilo;
    }
}
