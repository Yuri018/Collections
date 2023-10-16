package example3;

public class Main {
    public static void main(String[] args) {

        CreditCard card = new CreditCard(1000);
        Human husband = new Human("Man", card);
        Human wife = new Human("Frau", card);

        husband.start();
        wife.start();
    }
}
