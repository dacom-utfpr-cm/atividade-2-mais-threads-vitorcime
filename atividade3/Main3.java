/**
 * Fa¸ca um programa em Java com threads que exiba os
n´umeros primos entre 0 e 100000.
 */
public class Main3 {

    public static void main(String[] args) {
        new Thread(new PrimoThreads()).start();
    }
}