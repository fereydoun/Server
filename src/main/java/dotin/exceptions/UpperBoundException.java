package dotin.exceptions;

/**
 * Created by Dotin school 5 on 2/7/2015.
 */
public class UpperBoundException extends AccountException {

    public UpperBoundException()
    {

    }

    public UpperBoundException(String s)
    {
        super(s);

        System.out.println(s);
    }
}
