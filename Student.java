import java.util.*;

public class Student {

    private String studentName;
    private int rollNo;
    private long grade;
    List<String> subjectList;

    public Student(String studentName, int rollNo, long grade, List<String> subjectList) {
        this.studentName = studentName;
        this.rollNo = rollNo;
        this.grade = grade;
        this.subjectList = subjectList;
    }

    public String getStudentName() {
        return this.studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getRollNo() {
        return this.rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public long getGrade() {
        return this.grade;
    }

    public void setGrade(long grade) {
        this.grade = grade;
    }

    public List<String> getSubjectList() {
        return this.subjectList;
    }

    public void setSubjectList(List<String> subjectList) {
        this.subjectList = subjectList;
    }

}