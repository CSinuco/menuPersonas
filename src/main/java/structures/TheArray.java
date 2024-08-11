package structures;

import java.util.Arrays;

public class TheArray{
    public static void main(String[] args){
        String[] colors = new String[5]; 
        colors[0]= "blue";
        colors[1]= "purple";
        colors[2]= "black";
        colors[3]= "pink";
        colors[4]= "green";
        
        Arrays.sort(colors);//No se puede ordenar si hay elementos null
        

        for (String color : colors) {
            System.out.println(color);
        }
    }
}