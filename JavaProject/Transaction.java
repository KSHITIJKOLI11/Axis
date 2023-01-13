package JavaProject;
import java.sql.Date;

public class Transaction {
    int transactionId;
    Date transactionDate;
    String transactionType;
    float transactionAmount;
    float currentBalance;

    public void addTransaction(String transactionType, float transactionAmount, float transactionBalance){
        this.transactionDate = new Date(transactionId);
        this.transactionType=transactionType;
    }

    
}
