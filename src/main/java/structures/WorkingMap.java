package structures;

import java.util.HashMap;
import java.util.Map;
public class WorkingMap {
    public static void main(String[] args) {
        Map<Integer, Person> map = new HashMap<>();
        map.put(1, new Person("Maria"));
        map.put(2, new Person("Pedro"));
        map.put(3, new Person("Juan"));
        map.put(3, new Person("Marcos"));
        System.out.println(map);
    }
    record Person(String name){}
}   
