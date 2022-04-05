import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Trumpresident {

    private ArrayList<String> cardArr = new ArrayList<>();
    private boolean ready = true;//card setting or shuffling ready
    private int pickNo = 0;//뽑은 횟수
    Random random = new Random();
    String tmp;
    String rantmp;
    int randomNumber;

    private void cardSet() {
        cardArr.clear();
        for (int i = 0; i < 4; i++) {
            for (int j = 1; j <= 13; j++) {

                switch (i) {
                    case 0:
                        cardArr.add("♠"+(j+""));
                        break;
                    case 1:
                        cardArr.add("♥"+(j+""));
                        break;
                    case 2:
                        cardArr.add("◆"+(j+""));
                        break;
                    case 3:
                        cardArr.add("♣"+(j+""));
                        break;
                }//switch
            }//for j
        }//for i
    }

//    public void showAll(){
//        for(int i = 0 ; i < cardArr.size() ; i++){
//            System.out.println(cardArr.get(i));
//        }
//    }

    private void shuffle(){
        for (int c=0; c<5; c++) {
            for (int i = 0; i <= 51; i++) {
                tmp = cardArr.get(0);
                randomNumber = random.nextInt(52);
                rantmp = cardArr.get(randomNumber);
                cardArr.remove(0);
                cardArr.add(0, rantmp);
                cardArr.remove(randomNumber);
                cardArr.add(randomNumber, tmp);
            }
        }
    }//카드 섞기(private)

    public Trumpresident(){
        cardSet();
    }//Trumpresident cunstructor

    public void cardShuffle(int tmp) {
        for (int i=0; i<tmp; i++){
            shuffle();
        }
        ready = true;
        pickNo = 0;
    }//카드 섞기(public)

    public String cardPick() {
//        System.out.println(pickNo);
        ready = false;
        if (pickNo>=52){
            return "카드가 없습니다.";
        }
        pickNo++;
        return cardArr.get(pickNo-1);
    }//카드 뽑기 card pick

}
