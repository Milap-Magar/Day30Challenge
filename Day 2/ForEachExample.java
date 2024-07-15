import java.util.ArrayList;

public class ForEachExample {
    public static void main(String [] args){
    //for-each: method is traversing method to iterate through the elements in an array/collection
    //          lesser steps, more readable and less flexible.

        String[] animals = {"Cat", "Dog", "Cow", "Girrafe"};

        ArrayList<String> wild = new ArrayList<String>();

        wild.add("Lion");
        wild.add("Tiger");
        wild.add("Leopard");

        for(String i : wild){
            System.out.println(i);
        }
    }
}
