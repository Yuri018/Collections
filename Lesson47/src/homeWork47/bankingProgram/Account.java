package homeWork47.bankingProgram;

public class Account {
    String accountNumber;

    public Account(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber='" + accountNumber + '\'' +
                '}';
    }
}
