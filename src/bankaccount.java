import java.awt.*;
import java.io.PrintStream;
import java.util.Scanner;

public class bankaccount {
    public static void main(String[] args){
        Bank hamon = new Bank();

//        hamon.makeAccount("박규태");
//        hamon.makeAccount("박규태");
//        hamon.makeAccount("태");
//        hamon.makeAccount("박");
//        hamon.makeAccount("규");
//
//        hamon.deposit("박", 999999999);
//        hamon.withdraw("d", 9999);
//        hamon.withdraw("박",9999);
//        hamon.withdraw("박",999999999);
//
//        hamon.deposit("박규태",9999999);
//        hamon.deposit("규",9999999);
//        hamon.deposit("태",9999999);
//
//        hamon.remittance("규", "태", 99);
//
//        hamon.masterSearch(123456);

        Scanner sc = new Scanner(System.in);
        PrintStream so = System.out;
        String input;
        String tmpInput;
        String mainInput;
        String makingInputAccount;
        String makingOutputAccount;
        String makingInputMoney;

        while (true){

            so.println("\n\n\n\n\n\n\n\nWelCome To HamonBank");
            so.println("1. 계좌 생성");
            so.println("2. 입금/송금");
            so.println("3. 출금");
            so.println("4. 계좌 조회");
            so.println("0. 종료");

            mainInput = sc.next();

            if (mainInput.equals("1")) {
                while (true) {
                    so.println("\n성함을 입력해주세요.\n");

                    tmpInput = sc.next();

                    if (tmpInput.equals("0")) {
                        break;
                    }

                    hamon.makeAccount(tmpInput);

                    System.out.print("\n계속 진행하려면 Enter를 입력해주세요\n");
                    try{
                        System.in.read();
                    } catch (Exception e){
                        e.printStackTrace();
                    }

                    break;

                }

                continue;

            }else if(mainInput.equals("2")) {

                while (true) {
                    so.println("1. 입금");
                    so.println("2. 송금");
                    so.println("0. 돌아가기");

                    tmpInput = sc.next();

                    if (tmpInput.equals("1")) {
                        while (true) {
                            so.println("\n입금하실 계좌 정보를 입력해주세요.\n");
                            makingInputAccount = sc.next();
                            if (hamon.accountSearch(makingInputAccount)==(null)){
                                if (makingInputAccount.equals("0")) {
                                    break;
                                }
                                continue;
                            }
                            so.println("\n입금하실 금액을 입력해주세요.\n");
                            makingInputMoney = sc.next();
                            try {
                                Integer.parseInt(makingInputMoney);
                            } catch (Exception e) {
                                so.println("\n입금하실 금액은 숫자로 입력해주세요.\n");
                                if (makingInputMoney.equals("0")) {
                                    break;
                                }
                                continue;
                            }
                            hamon.deposit(makingInputAccount, Integer.parseInt(makingInputMoney));

                            System.out.print("\n계속 진행하려면 Enter를 입력해주세요\n");
                            try{
                                System.in.read();
                            } catch (Exception e){
                                e.printStackTrace();
                            }

                            break;
                        }
                    } else if (tmpInput.equals("2")) {
                        while (true) {
                            so.println("\n송금하시는 분의 성함을 입력해주세요.\n");
                            makingOutputAccount = sc.next();
                            if (hamon.accountSearch(makingOutputAccount)==(null)){
                                if (makingOutputAccount.equals("0")) {
                                    break;
                                }
                                continue;
                            }
                            so.println("\n송금받는 분의 성함을 입력해주세요.");
                            makingInputAccount = sc.next();
                            if (hamon.accountSearch(makingInputAccount)==(null)){
                                if (makingInputAccount.equals("0")) {
                                    break;
                                }
                                continue;
                            }

                            so.println("\n송금하실 금액을 입력해주세요.\n");
                            makingInputMoney = sc.next();
                            try {
                                Integer.parseInt(makingInputMoney);
                            } catch (Exception e) {
                                so.println("\n송금하실 금액은 숫자로 입력해주세요.\n");
                                if (makingInputMoney.equals("0")) {
                                    break;
                                }
                                continue;
                            }


                            hamon.remittance(makingInputAccount, makingOutputAccount, Integer.parseInt(makingInputMoney));

                            System.out.print("\n계속 진행하려면 Enter를 입력해주세요\n");
                            try{
                                System.in.read();
                            } catch (Exception e){
                                e.printStackTrace();
                            }

                            break;
                        }

                    } else if (tmpInput.equals("0")) {
                        break;
                    } else {
                        so.println("\n다시 입력해 주세요.\n");
                        continue;
                    }
                }

                continue;

            }else if(mainInput.equals("3")) {

                while (true) {
                    so.println("\n출금하실 계좌 정보를 입력해주세요.\n");
                    makingOutputAccount = sc.next();
                    if (hamon.accountSearch(makingOutputAccount) == (null)) {
                        if (makingOutputAccount.equals("0")) {
                            break;
                        }
                        continue;
                    }
                    so.println("\n출금하실 금액을 입력해주세요.\n");
                    makingInputMoney = sc.next();
                    try {
                        Integer.parseInt(makingInputMoney);
                    } catch (Exception e) {
                        so.println("\n출금하실 금액은 숫자로 입력해주세요.\n");
                        if (makingInputMoney.equals("0")) {
                            break;
                        }
                        continue;
                    }
                    hamon.withdraw(makingOutputAccount, Integer.parseInt(makingInputMoney));

                    System.out.print("\n계속 진행하려면 Enter를 입력해주세요\n");
                    try{
                        System.in.read();
                    } catch (Exception e){
                        e.printStackTrace();
                    }

                    break;

                }

                continue;


            }else if(mainInput.equals("4")) {
                while (true) {
                    so.println("\n조회하실 계좌 정보를 입력해주세요.\n");
                    tmpInput = sc.next();
                    if (tmpInput.equals("123456")) {
                        hamon.masterSearch(123456);

                        System.out.print("\n계속 진행하려면 Enter를 입력해주세요\n");
                        try{
                            System.in.read();
                        } catch (Exception e){
                            e.printStackTrace();
                        }
                        break;
                    }else if(tmpInput.equals("0")) {
                        break;
                    }else {
                        try {
                            hamon.customerSearch(tmpInput);

                            System.out.print("\n계속 진행하려면 Enter를 입력해주세요\n");
                            try{
                                System.in.read();
                            } catch (Exception e){
                                e.printStackTrace();
                            }

                            break;

                        } catch (Exception e){

                            System.out.print("\n계속 진행하려면 Enter를 입력해주세요\n");
                            try{
                                System.in.read();
                            } catch (Exception ee){
                                ee.printStackTrace();
                            }

                            break;
                        }
                    }

                }
                continue;

            }else if(mainInput.equals("0")) {
                so.println("bye");
                break;
            }else {
                so.println("\n다시 입력해주세요.\n");
            }

        }

    }
}
