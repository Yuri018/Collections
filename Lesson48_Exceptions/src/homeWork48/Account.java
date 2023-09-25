package homeWork48;

public class Account {
    private String iban;
    private Person nameAndSurname;

    public Account(String iban, Person nameAndSurname) {
        this.iban = iban;
        this.nameAndSurname = nameAndSurname;
    }

    @Override
    public String toString() {
        return "iban: " + iban + "Name Surname: " + nameAndSurname + "\n";
    }
}
