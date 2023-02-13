import java.util.*;
abstract class StudentOperations {
    
    public abstract List<Student> addStudent(List<Student> studentList, List<String> subjectList);
    public abstract void display(List<Student> studentList) ;
    public abstract void searchStudent(List<Student> studentList, int rollNo);
    public abstract void avgGrade(List<Student> studentList);
    public abstract void removeStudent(List<Student> studentList, int rollNo);
    
}
