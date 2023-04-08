import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudyGroup implements Iterable<Student > {
    List<Student> studentList;

    public StudyGroup(){
        studentList = new ArrayList<>();
    }

    public void addStudent(Student student){

        studentList.add(student);
    }

    public List<Student> getstudentList(){
        return studentList;
    }
    
    @Override
    public Iterator<Student> iterator(){
        return new StudentIterator(studentList);
    }
    
}
