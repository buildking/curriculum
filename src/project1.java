import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class project1 {
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
                so.println("조회를 선택했습니다.");

                break;
            case 2:
                so.println("추가를 선택했습니다.");

                //TODO 입력받기
                //Student student = new Student(1, "ddd", "주소");
                //studentsBook.add(student);

                int addNo = firstInput;
                if addNo ==


                break;
            case 3: so.println("삭제를 선택했습니다.");
                    break;
            default: so.println("잘못 입력했습니다. 숫자로 1, 2, 3 중에서 선택해주세요.");
        }

    }
}
