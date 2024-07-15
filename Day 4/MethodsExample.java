class MethodsExample{
    public static void main(String[] args) {
        int x = 3;
        int y = 4;
        int z = 5;

        int sumValue = sum(x, y);
        int sumValueofThree = sum(x, y , z);
        int subsValue = subs(x, y);
        int multiplyValue = multiply(x, y);
        int diviedValue = divide(x, y);

        System.out.println("The sum value is " + sumValue);
        System.out.println("The sum value is " + sumValueofThree);
        System.out.println("The substration value is " + subsValue);
        System.out.println("The multiplied value  is " + multiplyValue);
        System.out.println("The divided value is " + diviedValue);
    }
    static int sum(int x, int y){
        return x + y;
    }
    static int sum(int x, int y, int z){
        return x + y + z;
    }
    static int subs(int x, int y){
        return x - y;
    }
    static int multiply(int x, int y){
        return x * y;
    }
    static int divide(int x, int y){
        return x / y;
    }
}