PARTE 2.-
// Explique a detalle cada literal (1.5 cada literal) ouede usar la parte posterior para la explicacion.
//g.-¿Que son setters y getters?Explique con un ejemplo en codigo
Los setters y getters son metodos en programación que se utilizan para establecer o asignar y obtener o recuperar valores de atributos en objetos, permite acceder y modificar la información en el objeto.
Setters: para establecer y Getters sirve para obtenerlos.
public class Persona{
String nombre;
//Getter para obtener el nombre
public void getNombre(){
   return nombre;
}

//Setter para establecer el nombre
public void setnombre(String nuevoNombre){
this.nombre=nuevoNombre;
}
}
//Uso de los metodos
Persona persona1=new Persona();
persona1.setNombre("Silvia");
String nombrePersona1=persona.1 getNombre();

-------------------------------------------------------------------------------------------------------------------------------------------------
h.-Indique una secuencia de comandos en git que permitan clonar un repositorio, traer los ultimos cambios y una vez realizados los cambios, actualizar los cambios.
- Clonar el repositorio
git clone:"Url del repositorio"
- Traer los Ultimos Cambios del Repositorio Remoto
 git pull origin nombre_de_tu_rama
-Realizar Cambios Locales
-Agregar y Confirmar los Cambios Locales
git add
git commit -m "Describir los cambios que se hayan realizado"
- Actualiza los Cambios en el Repositorio Remoto
git push origin nombre_de_tu_rama

---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
i.- ¿Para que se utiliza "try" y "catch" en java? Explique con un ejemplo en codigo.
try y catch son bloques que se utilizan en programacion para manejar excepciones, de este modo permite que el codigo maneje situaciones inesperads de manera más controlada.

public class DivisionEjemplo{
  public static void main(String [] args)
  int numerador=0;
  int denominador=0;

   try {
     int resultado=dividir (numerador, denominador);
     System.out println("Resultado: "+resultado);
   }
   catch (ArtimeticExceptio e){
     System.out println ("Error: Division por cero no permitido");}

    public static int dividir(int numerador, int denominador){
    return numerados/denominador;
    }
}

---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
j.- Defina Programación Orientada a Objetos y el concepto de constructoes.Muestr un ejemplo de los tipos de constructores que puede haber

POO: Es un modelo o estilo de programación que da unas guías sobre como trabajar con el, se basa en el concepto de modelos y objetos, se utiliza para estructurar un 
programa de software en piezas simples y reutilizables de planos de código para crear instancias individuales de objetos.
Constructores: se utilizan para inicializar objetos y establecer propiedades y valores predeterminados.

//Constructor por defecto
public class Ejemplo {
  public Ejemplo(){
  }
}

// Constructor con Parámetros

public class Persona{
  String nombre;
  int edad;

  public Persona (String nombre, int edad){
  this.nombre=nombre;
  this.nombre=edad;
  }
}

