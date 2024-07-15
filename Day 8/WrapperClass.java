public class WrapperClass {
    public static void main( String [] args){
        /* Wrapper classes: Those classes which provides a way to use primitive data types as reference data types
                            which contains useful methods can be used with collections, Like [ Array Lists ].

        // primitive values > reference values [In terms of speed]

           primitive    wrapper
           --------    ---------
           -> boolean  -> Boolean
           -> int      -> Integer
           -> double   -> Double
           -> char     -> Character

           ->Auto-Boxing: Automatic conversion that the Java compiler makes between the primitive type and their
                          corresponding objects.
           ->Unboxing: The reverse of Auto-Boxing. Automatic conversion of wrapper class to primitive class.
        */
        Boolean a = true;
        Character b = '@';
        Integer c = 123;
        Double d = 3.14;
        String e = "Hero";
    }
}
