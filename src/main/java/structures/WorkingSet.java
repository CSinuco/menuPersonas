package structures;

import java.util.HashSet;
import java.util.Set;
public class WorkingSet {
    public static void main(String[] args) {
        Set<Ball> balls = new HashSet<>();
        balls.add(new Ball("Blue"));
        balls.add(new Ball("Yellow"));
        balls.add(new Ball("Red"));
        balls.forEach(System.out::println);
    }   
    record Ball(String color){}
}
