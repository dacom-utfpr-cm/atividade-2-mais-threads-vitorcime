/**
 * Fa¸ca um programa em Java para testar um conjunto de
opera¸c˜oes sobre um grupo de threads. Use o ThreadGroup.
 */
public class Main2 {

    public static void main(String[] args) {
        ThreadGroup group = new ThreadGroup("meugrupo");
        
        Thread t1 = new Thread(group, new ExemploThread(), "t1");
        Thread t2 = new Thread(group, new ExemploThread(), "t2");
        Thread t3 = new Thread(group, new ExemploThread(), "t3");
        
        t1.start();
        t2.start();
        t3.start();

        System.out.println("Número de Threads ativas no grupo: " + group.activeCount());
        System.out.println("O nome do grupo é " + group.getName());
        
        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (Exception e) {
            System.out.println("Erro ao esperar as Threads");
        }

        try {
            group.destroy();
            System.out.println("Grupo destruido");
        } catch (Exception e) {
            System.out.println("Erro ao destruir " + e);
        }
        
    }
}