package za.ac.cput.Factory;

import za.ac.cput.domain.Student;

public class StudentFactory {
    public static void main(String[] args) {


        Student student = new Student.Builder()
                .setName("Sabie")
                .setPhoneNumber("07903648987")
                .setEmail("sabeloceza@gmail.com")
                .setStudentNumber("26469854")
                .setAverageMark(90)
                .build();

        System.out.println(student.toString());
    }
}