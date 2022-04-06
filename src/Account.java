import java.lang.reflect.Array;
import java.util.ArrayList;

public class Account {
    private String customerName;//고객명
    private String accountNo;//계좌번호
    private int seqNo;
    private int accountBalance;

    public Account(int seqNo, String customerName, String accountNo, int accountBalance){
        this.seqNo = seqNo;
        this.customerName = customerName;
        this.accountNo = accountNo;
        this.accountBalance = accountBalance;
    }


    public String getName() {
        return customerName;
    }
    public void setName(String name) {
        this.customerName = name;
    }

    public String getAccountNo() {
        return accountNo;
    }
    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public int getSeqNo() {
        return seqNo;
    }
    public void setSeqNo(int seqNo) {
        this.seqNo = seqNo;
    }

    public int getAccountBalance() {
        return accountBalance;
    }
    public void setAccountBalance(int accountBalance) {
        this.accountBalance = accountBalance;
    }

}
