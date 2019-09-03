/**
 * ExemploThread
 */


public class ExemploThread implements Runnable {
    @Override
    public void run() {
        try {
            System.out.println("Comecei");
            Thread.sleep((long)(Math.random() * 50000));
            System.out.println("Terminei");
        } catch (InterruptedException ex) {
            System.out.println("Interrompida");
            return;
        }
    }
    
}