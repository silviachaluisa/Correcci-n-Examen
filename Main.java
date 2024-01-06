import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args){
        System.out.println("CORRECCION PARTE1._");
        System.out.println();
        Cancion cancion1=new Cancion("Rock","Rock Clasico","Stair");
        Cancion cancion2=new Cancion("Electronica","House","Animals");

        //Almacenar una lista
        List<Cancion> listaCanciones = new ArrayList<>();
        listaCanciones.add(cancion1);
        listaCanciones.add(cancion2);

        //Acceder a los objetos y mostrar informacion
        for (Cancion cancion : listaCanciones){
            System.out.println("Genero: "+cancion.getNombre());
            System.out.println("SubGenero: "+cancion.getEstilo());
            System.out.println("Nombre  de la cancion: "+cancion.getNombreCancion());
            System.out.println("-----------------------------");

        }

    }
}

