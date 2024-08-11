package structures;

import java.util.ArrayList;
import java.util.List;

public class WorkingWithLists {
    public static void main(String[] args) {
        //Tiene la capacidad de agregar tantos elementos como sea necesario
        List<String> colors = new ArrayList<>();
        colors.add("Blue");
        colors.add("Pink");
        //colors.add(5);
        System.out.println(colors);
        colors.remove("Pink");
        System.out.println(colors);
    }
}
