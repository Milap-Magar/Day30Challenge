public class ArrayExample {
    public static void main(String [] args){
        // Array = It is used to store multiple values in single variable

        String[] cars = new String[3];

        cars[0] = "Tesla";
        cars[1] = "Rover";
        cars[2] = "BMW";

        for(int i = 0; i < cars.length; i++) {
            System.out.println("CARS: " + cars[i]);
        }
    }
}
