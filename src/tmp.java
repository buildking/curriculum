import java.util.UUID;

public class tmp {
    public static void main(String[] args){

        String account;



        for (int i=0; i<10; i++){
            String uuid = UUID.randomUUID().toString();
            account = uuid;
            System.out.println(account);
        }
    }
}
