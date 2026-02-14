package za.ac.cput.domain;

public class Student {
    private String studentNumber;
    private int averageMark;

    public Student() {
    }

    public Student(String studentNumber, int averageMark) {
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
