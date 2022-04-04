import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class project2 {
    public static void main(String[] args){
        //java는 선언, 생성, 사용

        List<Student> studentsBook = new ArrayList<>();

        StudentBook book = new StudentBook();

        PrintStream so = System.out;

        so.println("[최초실행]");
        so.println("1. 조회");
        so.println("2. 추가");
        so.println("3. 삭제");

        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        int firstInput = sc.nextInt();


        switch (firstInput){
            case 1:
                so.println("1번을 입력했습니다.");

                break;
            case 2:
                so.println("2번을 입력했습니다.");

                //TODO 입력받기 이름입력
                Student student = new Student(1, "ddd", "주소");
                studentsBook.add(student);



                break;
            case 3: so.println("3번을 입력했습니다.");
                break;
            default: so.println("잘못 입력했습니다.");
        }

    }

}
