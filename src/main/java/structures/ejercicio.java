package structures;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ejercicio {
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.desplegarMenu();
        menu.ejecucion();
    }
    
}
class Menu {
    Map <Integer, Persona> personas = new HashMap<>();
    int contador = 0;
    
    void desplegarMenu(){

        System.out.println("1. Insercion");
        System.out.println("2. Busqueda");
        System.out.println("3. Actualizacion");
        System.out.println("4. Borrar");
        System.out.println("7. Mostrar valores");
        System.out.println("6. Salir");
        
        
    }

    
    int recibirDato() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Elija una opción:");
            String input = scanner.nextLine();
            try {
                int opcion = Integer.parseInt(input);
                if (opcion >= 1 && opcion <= 6) {
                    return opcion;
                } else {
                    System.out.println("Opción no válida. Por favor, ingrese un número entre 1 y 5.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada no válida. Por favor, ingrese un número.");
            }
        }
    }
    void ejecucion(){
        
        Scanner scanner = new Scanner(System.in);
        
        boolean salir = false;
        while (!salir) {
            
            int opcion = recibirDato();  //
            switch (opcion) {
                case 1:
                    insertarPersona(scanner);
                    break;
                case 2:
                    buscarPersona(scanner);
                    break;
                case 3:
                    actualizarPersona(scanner);
                    
                    break;
                case 4:
                    eliminarPersona(scanner);
                    
                    break;
                case 5:
                    
                    break;
                case 6:
                    System.out.println("Eligio la opcion 6");
                    salir = true;
                    scanner.close();
                    break;
                default:
                    System.out.println("no valido");
                    break;
            }
        }
        
    }
    void insertarPersona(Scanner scanner){
        System.out.println("Eligio la opcion 1");
        System.out.println("Ingrese el nombre ");
        String nombre = scanner.nextLine();
        System.out.println("ingrese el numero ");
        int numero = Integer.parseInt(scanner.nextLine());
        personas.put(contador++, new Persona(nombre, numero));
        System.out.println("Se creo la persona con id: "+ contador);
    }
    void buscarPersona(Scanner scanner){
        System.out.println("Eligio la opcion 2");
        System.out.println("Ingrese el id de la persona");
        int id = Integer.parseInt(scanner.nextLine());
        Persona persona = personas.get(id);
        if(persona == null){
            System.out.println("No se encontro ");
        }else{
            System.out.println(persona);
        }
    }
    void actualizarPersona(Scanner scanner){
        System.out.println("Eligio la opcion 3");
        System.out.println("Ingrese el id de la persona");
        int id = Integer.parseInt(scanner.nextLine());
        if(!personas.containsKey(id)){
            System.out.println("No se encontro ");
        }else{
            System.out.println("Ingrese el nuevo nombre");
            String nombre = scanner.nextLine();
            System.out.println("Ingrese el nuevo numero");
            int numero = Integer.parseInt(scanner.nextLine());
            personas.put(id, new Persona(nombre, numero));
        }
        
    }
    void eliminarPersona(Scanner scanner){
        System.out.println("Eligio la opcion 4");
        System.out.println("Ingrese el id de la persona");
        int id = Integer.parseInt(scanner.nextLine());
        if(!personas.containsKey(id)){
            System.out.println("No se encontro ");
        }else{
            personas.remove(id);
        }
    }
    void mostrarPersona(){
        System.out.println("Eligio la opcion 5");
        personas.forEach((id, persona) ->System.out.println("Persona: "+ persona)) ;
    }


}
/**
 * Innerejercicio
 */
record Persona(String name, int numero) {
}
