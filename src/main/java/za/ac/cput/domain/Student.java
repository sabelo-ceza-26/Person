package za.ac.cput.domain;

public class Student extends Person{
    protected String studentNumber;
    protected int averageMark;

    public Student() {
    }

    private Student(String studentNumber, int averageMark) {
        this.studentNumber = studentNumber;
        this.averageMark = averageMark;
    }

    private Student(String name, String phoneNumber, String email, String studentNumber, int averageMark) {
        super(name, phoneNumber, email);
        this.studentNumber = studentNumber;
        this.averageMark = averageMark;
    }
    public Student(Builder builder){
        super(builder);
        this.studentNumber = builder.studentNumber;
        this.averageMark = builder.averageMark;

    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public int getAverageMark() {
        return averageMark;
    }

    @Override
    public String toString() {
        return "Student: " +
                "\nStudent Number: " + studentNumber +
                "\nAverage Mark: " + averageMark +
                "\nName: " + name +
                "\nPhone Number: " + phoneNumber +
                "\n Email: " + email;
    }

    public static class Builder extends Person.Builder {
        protected int averageMark;
        protected String studentNumber;

        public Builder setStudentNumber(String studentNumber) {
            this.studentNumber = studentNumber;
            return this;
        }

        public Builder setAverageMark(int averageMark) {
            this.averageMark = averageMark;
            return this;
        }
            public Builder setName(String name) {
                this.name = name;
                return this;
        }

        public Builder setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }
        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder copy(Student student){
            super.copy(student);
            this.averageMark = student.averageMark;
            this.studentNumber = student.studentNumber;
            return this;
        }
        public Student build(){
            return new Student(this);
        }


    }


}
