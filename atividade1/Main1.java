/**
 * Main1
 */
public class Main1 {

    public static void main(String[] args) {
        Thread myThreads[] = new Thread[3];
        for (int i = 0; i < 3; i++) {
            myThreads[i] = new Thread(new ExemploThread());
            myThreads[i].start();
        }
        new Thread(new Monitor(myThreads)).start();
        try {
            Thread.currentThread().sleep(5000);    
        } catch (Exception e) {
            System.out.println("Algo deu errado na main");
        }

    }
    
}