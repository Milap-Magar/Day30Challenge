public class TwoArrays {
    public static void main( String [] args){
    //    2 D arrays are basically arrays of array.
        String[][] cars = {
                {"Camero", "Corvett", "Tesla"},
                {"Mustang", "Rover", "F-1"},
                {"Ferarri", "Lambo", "BMW"}
        };
        for(int i = 0; i < cars.length ; i++){
            System.out.println();
            for(int j =0 ; j < cars[i].length; j++){
                System.out.println(cars[i][j] + " ");
            }
        }
    }
}
