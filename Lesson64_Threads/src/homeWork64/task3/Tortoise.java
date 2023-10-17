package homeWork64.task3;

public class Tortoise extends Thread{
    @Override
    public void run(){
        for (int i = 0; i < 12; i++) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("I just run");
        }
    }
}
