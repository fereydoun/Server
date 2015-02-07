package dotin.entities;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created by Dotin school 5 on 2/7/2015.
 */
public class Transaction implements Serializable {

    private int transactionID;
    private String depositID;
    private String operationType;
    private BigDecimal amount;
    private String result;

    public int getTransactionID() {
        return transactionID;
    }

    public void setTransactionID(int transactionID) {
        this.transactionID = transactionID;
    }

    public String getDepositID() {
        return depositID;
    }

    public void setDepositID(String depositID) {
        this.depositID = depositID;
    }

    public String getOperationType() {
        return operationType;
    }

    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
