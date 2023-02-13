import java.util.*;

public class StudentManagementSystem extends StudentOperations {

    public List<Student> addStudent(List<Student> studentList, List<String> subjectList) {

        Student s1 = new Student("Sumit", 1, 90, subjectList);
        Student s2 = new Student("Amit", 2, 85, subjectList);
        Student s3 = new Student("Ankit", 3, 95, subjectList);
        Student s4 = new Student("Neeta", 4, 88, subjectList);
        Student s5 = new Student("Vikas", 5, 78, subjectList);

        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        studentList.add(s4);
        studentList.add(s5);

        return studentList;
    }

    public void display(List<Student> studentList) {
        System.out.println("Display all the Student Details:");
        if(studentList.size() == 0){
            System.out.println("Empty List nothing to display.");
        }
        for (int i = 0; i < studentList.size(); i++) {
            System.out.println("Student Name: " + studentList.get(i).getStudentName() + ", Roll No: "
                    + studentList.get(i).getRollNo() +
                    ", Grade: " + studentList.get(i).getGrade());

        }

    }

    public void searchStudent(List<Student> studentList, int rollNo) {

        if (studentList.size() == 0) {
            System.out.println("Empty List Student not found.");
        } else {
            for (int i = 0; i < studentList.size(); i++) {
                if (rollNo == studentList.get(i).getRollNo()) {
                    System.out.println("Name of Searched student= " + studentList.get(i).getStudentName());
                }
            }
        }

    }

    public void avgGrade(List<Student> studentList) {
        int sum = 0;
        for (int i = 0; i < studentList.size(); i++) {
            sum += studentList.get(i).getGrade();
        }
        int avg = sum / studentList.size();
        System.out.println("Average grade of all students= " + avg);

    }

    public void removeStudent(List<Student> studentList, int rollNo) {

        if (studentList.size() == 0) {
            System.out.println("Empty List.");
        } else {
            for (int i = 0; i < studentList.size(); i++) {
                if (rollNo == studentList.get(i).getRollNo()) {
                    studentList.remove(i);
                }
            }
            System.out.println("List After removing: ");
            display(studentList);
        }

    }

    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>();
        List<String> subjectList = new ArrayList<>();

        subjectList.add("English");
        subjectList.add("Math");
        subjectList.add("Java");
        StudentManagementSystem sb = new StudentManagementSystem();
        sb.addStudent(studentList, subjectList);
        sb.display(studentList);
        sb.avgGrade(studentList);
        sb.searchStudent(studentList, studentList.get(2).getRollNo());
        sb.removeStudent(studentList, studentList.get(1).getRollNo());

    }

}
