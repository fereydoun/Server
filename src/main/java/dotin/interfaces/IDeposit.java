package dotin.interfaces;

import java.math.BigDecimal;

/**
 * Created by Dotin school 5 on 2/7/2015.
 */
public interface IDeposit {

    public void deposit(BigDecimal amount);
    public void withdraw(BigDecimal amount);
}
