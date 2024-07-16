import java.util.Random;

class FileDownloader extends Thread {
    private String fileName;

    public FileDownloader(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void run() {
        System.out.println("Starting download: " + fileName);
        try {
            // Simulate time taken to download a file
            Random rand = new Random();
            int downloadTime = rand.nextInt(5000) + 1000; // Random time between 1 and 6 seconds
            Thread.sleep(downloadTime);
        } catch (InterruptedException e) {
            System.out.println("Download interrupted: " + fileName);
        }
        System.out.println("Completed download: " + fileName);
    }
}
