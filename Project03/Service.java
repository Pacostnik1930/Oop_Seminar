public class Service {
    private int id;
    private StudyGroup group;

    public Service(StudyGroup group){
        this.group = group;
        id = 0;

    }
    public void addStudent(String name){
        group.addStudent(new Student(id++, name));
    }
}
