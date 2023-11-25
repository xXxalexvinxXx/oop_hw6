package ru.gb.oseminar.data;

import java.time.LocalDate;

public class Student extends User implements Comparable<Student>{
    private Long studentId;

    //region Дублирующая запись
//    public Student(String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
//        super(firstName, secondName, patronymic, dateOfBirth);
//    }
    //endregion

    public Student(String firstName, String secondName, String patronymic, LocalDate dateOfBirth, Long studentId) {
        super(firstName, secondName, patronymic, dateOfBirth);
        this.studentId = studentId;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "Student{" +
               "studentId='" + studentId +'\'' +
               ", firstName='" + super.getFirstName() + '\'' +
               ", secondName='" + super.getSecondName() + '\'' +
               ", patronymic='" + super.getPatronymic() + '\'' +
               ", dateOfBirth=" + super.getDateOfBirth() +
               '}';
    }

    //region Использовать UserComparator (принцип единсвенной ответственности)
    @Override
    public int compareTo(Student o) {
        return this.studentId.compareTo(o.studentId);
    }
    //endregion
}
