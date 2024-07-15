public class StringMethods {
    public static void main(String [] args){

    //    String: It is a reference data type that can store one or more characters.
    //            reference data types have access to useful methods.

    //    1) String methods: equals() && equalsIgnoreCase():

        String name = "Bro";
        //  boolean result = name.equals("bro");  //Returns false
        boolean result = name.equalsIgnoreCase("bro"); //Returns true
        System.out.println(result);

    // 2) String methods: length():
        int output = name.length();
        System.out.println(output);

    // 3) String methods: charAt():
        char outcome = name.charAt(0);
        System.out.println(outcome);

    // 4) String methods: indexOf():
        int res = name.indexOf("r");
        System.out.println(res);

    // 5) String methods: isEmpty():
        boolean response = name.isEmpty();
        System.out.println(response);

    // 6) String methods: toUpperCase():
        String upperValue = name.toUpperCase();
        System.out.println(upperValue);

    // 7) String methods: toLowerCase():
        String lowerValue = name.toLowerCase();
        System.out.println(lowerValue);

    //8) String methods: trim():
        String value = "              egg     ";
        String trimmedValue = value.trim();
        System.out.println(trimmedValue);

    //9) String methods: replace():
        String section = "Sagarmatha";
        String value2 = section.replace('a', 'o');
        System.out.println(value2);
    }
}