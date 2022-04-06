import java.util.*;

public class Bank {

    private ArrayList<Account> accountList = new ArrayList();//bank로 이동
    private ArrayList<Account> tmpList = new ArrayList();//bank로 이동

    private Random random = new Random();
    private int randomNumber;//랜덤값 저장


    private int account;
    private String accountNo;
    private Account tmpAccount;
    private Account inputAccount;
    private Account outputAccount;
    private int tmpAccountMoney;

    private int seqNo;//고객고유번호
    private String customerName;//고객이름
    private String bankName;//은행이름

    //생성자
    public Bank(){
        this.bankName = bankName;
        this.seqNo = 0;
    }




    //계좌생성
    public void makeAccount(String customerName){

        //계좌리스트 조회 후 동일한 이름이 있으면 cut
        for (int i = 0; i < accountList.size(); i++) {

            if (accountList.get(i).getName().equals(customerName)) {
                System.out.println("계좌만들기에 실패했습니다. 이미 등록되어있는 고객입니다.");
                return;
            }

        }


        seqNo++;
        String accountNo = UUID.randomUUID().toString();
        Account tmpAccount = new Account(seqNo, customerName, accountNo,0);
        accountList.add(tmpAccount);
        System.out.println(tmpAccount.getName()+"님, 계좌만들기에 성공했습니다.");

    }




    //고객명으로 조회
    public Account accountSearch(String input){
        for (int i=0; i<accountList.size(); i++) {

            if (accountList.get(i).getName().equals(input) || accountList.get(i).getAccountNo().equals(input)) {
                return accountList.get(i);
            }

        }

        System.out.println("일치하는 계좌가 없습니다. 다시 한번 확인해주세요.");
        return null;
    }

    //입금
    public void deposit(String input, int money){
        inputAccount = accountSearch(input);
        if (inputAccount.equals(null)){
            return;
        }
        tmpAccountMoney = accountSearch(input).getAccountBalance();
        inputAccount.setAccountBalance(tmpAccountMoney + money);
        System.out.println(inputAccount.getName()+"님, "+money+"원 입금됐습니다");
    }

    //출금
    public void withdraw(String output, int money){
        outputAccount = accountSearch(output);
        if (outputAccount.equals(null)){
            return;
        }
        tmpAccountMoney = accountSearch(output).getAccountBalance();

        if (tmpAccountMoney<money){
            System.out.println(outputAccount.getName()+"님, 잔액이 부족합니다.");
            return;
        }

        outputAccount.setAccountBalance(tmpAccountMoney - money);
        System.out.println(outputAccount.getName()+"님, "+money+"원 출금됐습니다");

    }

    //송금
    public void remittance(String input, String output, int money){
        inputAccount = accountSearch(input);
        outputAccount = accountSearch(output);
        if (inputAccount.equals(null) || outputAccount.equals(null)){
            return;
        }
        tmpAccountMoney = accountSearch(output).getAccountBalance();

        if (tmpAccountMoney<money){
            System.out.println(outputAccount.getName()+"님, 잔액이 부족합니다.");
            return;
        }

        inputAccount.setAccountBalance(inputAccount.getAccountBalance() + money);
        outputAccount.setAccountBalance(tmpAccountMoney - money);

        System.out.println(outputAccount.getName()+"님의 계좌에서 "+inputAccount.getName()+"님의 계좌로 "+money+"원 송금됐습니다.");

    }

    //계좌조회
    public void customerSearch(String input){
        Account cs = accountSearch(input);
        System.out.println("이름 : " + cs.getName()+',' + " 계좌 : " + cs.getAccountNo() + ',' + " 잔액 : " + cs.getAccountBalance() +"원");
    }


    //전체 조회
    public void masterSearch(int input){
        if (input==123456) {
            account = 0;
            for (int i = 0; i < accountList.size(); i++) {
                System.out.println(accountList.get(i));
                Account cs = accountSearch(accountList.get(i).getName());
                System.out.println(cs.getSeqNo() + " 이름 : " + cs.getName()+',' + " 계좌 : " + cs.getAccountNo()+',' + " 잔액 : " + cs.getAccountBalance() +"원");
                account = 1;
            }
            if (account == 0){
                System.out.println("등록돼있는 계좌정보가 없습니다.");
            }
        }
    }
}
