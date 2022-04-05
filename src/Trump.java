import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Trump {
    ArrayList<String> shape = new ArrayList<>(Arrays.asList("♠", "♥", "◆", "♣"));
    Random random = new Random();

    //Getter and Setter
    private int getNumber() {
        int resultNumber = random.nextInt(12);
        return resultNumber;
    }

    private String getShape() {
        int resultShape = random.nextInt(4);
        return shape.get(resultShape);
    }

    public String pick() {
        //System.out.println("♣" + "7");
        return (getShape()+ (getNumber() + ""));
    }
}
