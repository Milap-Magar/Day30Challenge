package src;

    public class HeapMemoryExample {
        public static void main(String[] args) {
            Person person1 = new Person("Alice"); // Object created in heap memory
            Person person2 = new Person("Bob");   // Another object in heap memory

            System.out.println(person1.getName());
            System.out.println(person2.getName());
        }
    }

    class Person {
        private String name;

        public Person(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

