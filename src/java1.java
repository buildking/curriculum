import java.io.PrintStream;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class java1 {

    public static void main(String[] arg){
        //String
        String voice = "Hello World";
        System.out.println(voice);//"Hello World"
        //int
        int num1 = -1234567890;
        System.out.println(num1);//-2,147,483,648 ~ 2,147,483,647
        //long
        long num2 = -1234567890123456789L;
        System.out.println(num2);//뒤에 L 붙이기
        //double
        double num3 = 0.1234567890123456789012345678901234567890123;
        System.out.println(num3);//18번째에서 자동으로 올림 혹은 버림(d 생략 가능)
        //boolean
        boolean var1 = true;
        boolean var2 = false;
        System.out.println(var1);//true
        System.out.println(var2);//false
        //byte
        byte num4 = -128;
        System.out.println(num4);//-128~127
        //Integer
        Integer num11 = new Integer(1234567890);
        Integer num12 = null;
        System.out.println(num11);//int boxing
        System.out.println(num12);//null 가능
        //BigInteger
        BigInteger num13 = new BigInteger("12345678901234567890123456789012345678901234567890123456789012345678901234567890");
        BigInteger num14 = null;
        PrintStream sop = System.out;
        sop.println(num13);//무제한, 문자열로 표현됨
        sop.println(num14);//null 가능
        //List
        ArrayList list1 = new ArrayList();
        list1.add(1);
        list1.add("list");
        list1.add("34");
        sop.println(list1);
        //Map
        HashMap <String, String> prmap = new HashMap<>();
        prmap.put("people", "사람");
        prmap.put("baseball", "야구");
        prmap.put("soccer", "축구");

        sop.println(prmap.get("soccer"));
        sop.println(prmap.containsKey("soccer"));
        sop.println(prmap.keySet());
        sop.println(prmap.size());

        prmap.remove("baseball");

        sop.println(prmap.size());

        HashMap rpmap = new HashMap();
        rpmap.put("dPwp", "single");
        rpmap.put("예제", prmap);

        sop.println(prmap);
        sop.println(rpmap);

        sop.println(rpmap.keySet());

        //if
        int money = 5000;
        String card = "shinhan";

        if (money >=3000 || card != null) {
            sop.println("ride");
        }else if(money>=1000){
            sop.println("halfride");
        }else{
            sop.println("walk");
        }

        //switch
        byte month = 100;
        String monthString = "";
        switch (month){
            case 1: monthString = "january";
                    break;
            case 2: monthString = "february";
                    break;
            case 3: monthString = "march";
                    break;
            case 4: monthString = "april";
                    break;
            case 5: monthString = "may";
                    break;
            case 6: monthString = "june";
                    break;
            case 7: monthString = "july";
                    break;
            case 8: monthString = "august";
                    break;
            case 9: monthString = "september";
                    break;
            case 10: monthString = "october";
                    break;
            case 11: monthString = "november";
                    break;
            case 12: monthString = "december";
                    break;
            default: monthString = "invalid month";
        }
        sop.println(monthString);

        //for
        for (int i=1; i<10; i++){
            for (int j=1; j<10; j++){
                sop.print(i*j);
                sop.print(" ");
            }
            sop.println();
        }

        //while
        int whale = 0;
        while (whale<10){
            whale++;
            sop.println("고래가" + whale + "마리 있습니다.");
            if (whale == 10){
                sop.println("만선입니다.");
            }
        }


        //class 생성자, 데이터, 메소드 ----- Dice.java
        Dice dice = new Dice();

        dice.roll();

        sop.println(dice.getResult());//dice result


        //class 상속, 생성, 사용
        class Dog extends Animal{
            void sleep(){
                sop.println(this.name + "zzz");
            }
        }//Dog is-a Animal

        Dog dog = new Dog();
        dog.setName("puppy");
        sop.println(dog.name);



    }
}
