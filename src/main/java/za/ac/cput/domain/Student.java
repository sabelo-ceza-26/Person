package za.ac.cput.domain;

public class Student extends Person{
    private String studentNumber;
    private int averageMark;

    public Student() {
    }



    public Student(String name, String phoneNumber, String email, String studentNumber, int averageMark) {
        super(name, phoneNumber, email);
        this.studentNumber = studentNumber;
        this.averageMark = averageMark;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public int getAverageMark() {
        return averageMark;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }


    public void setAverageMark(int averageMark) {
        this.averageMark = averageMark;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentNumber='" + studentNumber + '\'' +
                ", averageMark=" + averageMark +
                '}';
    }
}
