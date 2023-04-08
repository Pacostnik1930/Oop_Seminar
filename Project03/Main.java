import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        StudyGroup group = new StudyGroup();
        Service service = new Service(group);
        service.addStudent("Паша");
        service.addStudent("Даша");
        service.addStudent("Миша");
        service.addStudent("Саша");
        
        // Iterator<Student> iterator = group.iterator();
        // while(iterator.hasNext());
        // Student student = iterator.next();
        // System.out.println(student);
        
        for(Student student:group){
            System.out.println(student);
        }
        
    }
}
