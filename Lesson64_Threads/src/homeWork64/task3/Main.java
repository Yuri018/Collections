package homeWork64.task3;

public class Main {
    /*
    Создайте два потока: Ахилес (AchillesThread) и черепаха(TortoiseThread).
    Пусть в потоке Ахилес выводится фраза "I run fast" с интервалом полсекунды 30 раз.
    Пусть в потоке черепахи выводится фраза "I just run" c интервалом две секунды 12 раз.
    После того как эти потоки завершат работу выведите в консоль фразу - "Achilles can never overtake the tortoise?"
     */
    public static void main(String[] args) throws InterruptedException {
        Achilles achillesThread = new Achilles();
        Tortoise tortoiseThread = new Tortoise();

        achillesThread.start();
        tortoiseThread.start();
        tortoiseThread.join();
        System.out.println("Achilles can never overtake the tortoise?");
    }
}
