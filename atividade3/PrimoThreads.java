/**
 * PrimoThreads
 */
public class PrimoThreads implements Runnable{
    
    private int inicio;
    private int fim;

    public PrimoThreads(int inicio, int fim){
        this.inicio = inicio;
        this.fim = fim;
    }

    @Override
    public void run() {
        for (int i = this.inicio; i < this.fim; i++) {
            int divCount = 0;
            for(int j = 1; j <= i ; j++){
                if(i % j == 0){
                    divCount++;
                }
            }
            if(divCount == 2) {
                System.out.println("Primo: " + i);
            }
        }
    }
    
}