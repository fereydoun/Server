package dotin.exceptions;

/**
 * Created by Dotin school 5 on 2/7/2015.
 */
public class AccountException extends Exception {

    public AccountException()
    {
        super();
    }

    public AccountException(String s)
    {
        super(s);

        System.out.println(s);
    }
}
