class RunnableExample implements Runnable {
    private String threadName;

    RunnableExample(String name) {
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
        Thread t1 = new Thread(new RunnableExample("Thread 1"));
        Thread t2 = new Thread(new RunnableExample("Thread 2"));

        t1.start();
        t2.start();
    }
}
