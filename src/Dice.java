import java.util.Random;

public class Dice {
    int result;

    public Dice(){
        this.result = 0;
    }

    public void roll(){
        Random random = new Random();
        random.setSeed(System.currentTimeMillis());

        this.result = random.nextInt(6)+1;
    }

    public int getResult() {
        return this.result;
    }
}
