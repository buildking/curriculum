import java.util.ArrayList;
import java.util.Map;

public class Student {
    int seqNo;
    String name;
    String address;


    public Student(int _seqNo, String name, String address){
        this.seqNo = _seqNo;
        this.name = name;
        this.address = address;
    }

    public int getSeqNo() {
        return seqNo;
    }

    public void setSeqNo(int seqNo) {
        this.seqNo = seqNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
