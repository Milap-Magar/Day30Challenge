public class ShadowingDemo {
    int x = 5; // This x is an instance variable

    void method() {
        int x = 10; // This x shadows the instance variable x
        System.out.println("Value of x in method: " + x);
    }

    public static void main(String[] args) {
        ShadowingDemo demo = new ShadowingDemo();
        demo.method();
        System.out.println("Value of x in instance: " + demo.x);
    }
}
