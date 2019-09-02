public class Monitor implements Runnable{
    Thread myThreads[] = new Thread[3];
    
    public Monitor(Thread myThreads[]) {
        this.myThreads = myThreads;
    }
    @Override
    public void run() {
        try {
            for (int i = 0; i < 3 ; i++) {
                
                System.out.println("Thread " + (i+1) + " tem o estado de: " + myThreads[i].getState() );

                if(i == 2){
                    i = -1;
                    Thread.sleep(5000);
                }
            }
        } catch (Exception e) {
            
        }
    }
}