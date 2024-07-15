import java.util.ArrayList;

public class ArraylistExample {
    public static void main(String [] args){
        /* ArrayList: -> Resizable array.
                      -> Elements can be added and removed after compilation phase
                      store reference data types.
                      -> We use reference values like [ ArrayList<Ref-Val> ]
         */
        ArrayList<String> food = new ArrayList<String>();

        //Adding the values using add method in arraylist:
        food.add("apple");
        food.add("banana");
        food.add("citus");
        //Changing the values using set method in arrayList:
        food.set(0, "anar");
        //Removing the values using set method in arrayList:
        food.remove(2);
        //Clearing the values using set method in arrayList:
        food.clear();
        for(int i = 0; i < food.size(); i++ ){
            System.out.println(food.get(i));
        }
    }
}
