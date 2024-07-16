public class DownloadManager {
    public static void main(String[] args) {
        String[] files = {
            "file1.zip", "file2.zip", "file3.zip", 
            "file4.zip", "file5.zip"
        };

        Thread[] downloadThreads = new Thread[files.length];

        for (int i = 0; i < files.length; i++) {
            downloadThreads[i] = new FileDownloader(files[i]);
            downloadThreads[i].start();
        }

        // Wait for all threads to finish
        for (int i = 0; i < files.length; i++) {
            try {
                downloadThreads[i].join();
            } catch (InterruptedException e) {
                System.out.println("Main thread interrupted.");
            }
        }

        System.out.println("All downloads completed.");
    }
}
