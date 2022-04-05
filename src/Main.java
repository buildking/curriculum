import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        Trump trump = new Trump();
//
//        String card = trump.pick();
//
//
//        System.out.println(card);
//
//        Trumpresident poker = new Trumpresident();
//
//        poker.cardShuffle(14);
//        for(int i=0; i<60; i++) {
//            System.out.println(poker.cardPick());
//        }
//        poker.showAll();

        List<Student> _list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        System.out.print("1. 조회 2. 입력");
        int _input = sc.nextInt();

        switch(_input){
            case 1:
                for(int i = 0 ; i < _list.size() ; i++){
                    Student student = _list.get(i);
                    System.out.println(student.getSeqNo() + "_" + student.getName() + "_" + student.getAddress());
                }
                break;
            case 2:
                Student student = new Student(1, "이름", "string");
                _list.add(student);
                break;

        }

    }
}
