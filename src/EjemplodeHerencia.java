
import java.util.Date;

public class EjemplodeHerencia {

    public static void main(String[] args) {
    
        System.out.println("--------- Objeto Empleado --------");
        Empleado empleado1 = new Empleado("Luis",5000);
        //asignamos valor de la edad, genero, direccion con el metodo set con la palabra super definidad en el constructor de Empleado
        empleado1.setEdad(28);
        empleado1.setGenero('M');
        empleado1.setDireccion("calle de la tranquilidad #2");
        System.out.println(empleado1);
        System.out.println("");
   
        //asignamos valor de la sexo, nombre, edad, genero, direccion con el metodo set en este caso no agregarmos la palabra super en el constructor.
        System.out.println("--------- Objeto Cliente --------");
        Cliente cliente1 = new Cliente (new Date(), true);  
        cliente1.setNombre("Candida");
        cliente1.setGenero('F');
        cliente1.setEdad(25);
        cliente1.setDireccion("Emiliano Zapata #69");
        System.out.println(cliente1);
    
    
    }//fin llave main
    
}//fin llave EjemplodeHerencia
