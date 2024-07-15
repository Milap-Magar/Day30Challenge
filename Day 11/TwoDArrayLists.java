import java.util.*;
public class TwoDArrayLists {
    public static void main(String [] args){
    //2D arraylist => dynamic list of lists.
    // you can change the size of these list during runtime.
    ArrayList<ArrayList<String>> totalLists = new ArrayList();
    ArrayList<String> bakeryList = new ArrayList();
    bakeryList.add("Pasta");
    bakeryList.add("Banana-Pastery");
    bakeryList.add("Donut");

    ArrayList<String> productList = new ArrayList();
    productList.add("Garlic");
    productList.add("Banana");
    productList.add("Apple");

    ArrayList<String> drinksList = new ArrayList();
    drinksList.add("mix - fruit");
    drinksList.add("fresh juice");

    totalLists.add(bakeryList); //0 index
    totalLists.add(productList); // 1 index
    totalLists.add(drinksList); // 2 index
        System.out.println(totalLists.get(2).get(1));
    }
}
