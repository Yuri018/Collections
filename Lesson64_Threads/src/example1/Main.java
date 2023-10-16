package example1;

public class Main {
    public static void main(String[] args) {
        HenThread henThread = new HenThread();
        EggThread eggThread = new EggThread();

        //запуск потока - метод start
        henThread.start();
        eggThread.start();
    }
}
