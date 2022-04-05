import java.util.ArrayList;
import java.util.List;

public class StudentBook {
    //출석부
    private List<Student> list;

    public StudentBook(int _classNo){
        this.list = new ArrayList();
    }

    //출석부 전체 조회
    public void showAll(){
        if(this.list.size() != 0){
            for(Student _item : list){
                System.out.println(_item.getSeqNo() + " - " + _item.getName());
            }//for each()
        }
    }


    //이름으로 객체 하나 검색하기
    private Student searchStudent(String _name){
        if(list.size() == 0){
            return null;
        } else {
            for(Student _item : list){
            if(_item.getName().equals(_name)){
               return _item;
            }
         }//for each()
         return null;
      }
   }

   public void addStudent(Student _student){
      this.list.add(_student);
   }

   public void addStudent(int _seqNo, String _name, String _address){
      Student tempStudent = new Student(_seqNo, _name, _address);
      this.list.add(tempStudent);
   }

   public void delStudent(String _name){
      Student tempStudent = searchStudent(_name);
      if(tempStudent != null){
         this.list.remove(tempStudent);
      }
   }
}
