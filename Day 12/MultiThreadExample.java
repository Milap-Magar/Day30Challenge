class MultiThreadExample extends Thread {
    private String threadName;

    MultiThreadExample(String name) {
        threadName = name;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(threadName + " Value: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {
        MultiThreadExample t1 = new MultiThreadExample("Thread 1");
        MultiThreadExample t2 = new MultiThreadExample("Thread 2");

        t1.start();
        t2.start();
    }
}
