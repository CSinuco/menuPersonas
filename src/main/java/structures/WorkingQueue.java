package structures;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;

public class WorkingQueue {
    public static void main(String[] args) {
        Queue<Person> supermarket = new LinkedList<>();
        supermarket.add(new Person("Carlos", 23));
        supermarket.add(new Person("Pedro", 22));
        supermarket.add(new Person("Sirle", 29));
        //revisamos al que esta enfrente de la queue
        System.out.println(supermarket.peek());
        //Lo mostramos y eliminamos
        System.out.println(supermarket.poll());
        System.out.println(supermarket.size());

        //Las linked list son similares pero podemos elegir donde agregar, y podemos loopear hacia adelante como hacia atras porque tienen nodos de referencias

        LinkedList<Person> linkedList = new LinkedList<>();
        linkedList.add(new Person("Fabio", 10));
        linkedList.add(new Person("Marta", 20));
        linkedList.addFirst(new Person("Julio", 30));
        linkedList.add(2, (new Person("Federico", 19)));
        ListIterator<Person> personIterator = linkedList.listIterator();

        while (personIterator.hasNext()) {
            System.out.println(personIterator.next());
        }
        while (personIterator.hasPrevious()) {
            System.out.println(personIterator.previous());
        }
        
    }
    //Inmutabilidad, Genera constructor automaticamente, getters and setters, y son clases en las que se almancenan solamente datos
    static record Person(String name, int age ) {}
}
