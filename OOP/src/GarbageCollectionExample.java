package src;

public class GarbageCollectionExample {
    public static void main(String[] args) {
        Person person1 = new Person("Charlie");
        person1 = null; // Eligible for garbage collection

        // Forcing garbage collection (not recommended in production)
        System.gc();

        // Creating more objects to trigger garbage collection
        for (int i = 0; i < 1000; i++) {
            new Person("Person" + i);
        }
    }
}

class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println(this.name + " is being garbage collected");
    }
}
