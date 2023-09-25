package homeWork48;

import java.util.List;

public class AccountCreateException extends Exception{
    private List<String> errorList;

    public AccountCreateException(List<String> errorList) {
        this.errorList = errorList;
    }

    public List<String> getErrorList() {
        return errorList;
    }
}
