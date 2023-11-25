package EqualsHashCode;

import java.util.Objects;

public class Student {
    private String fio;
    private int Age;
    private int numberOfStudak;
    private String gendrer;

    public Student(String fio, int age, int numberOfStudak, String gendrer) {
        this.fio = fio;
        this.Age = age;
        this.numberOfStudak = numberOfStudak;
        this.gendrer = gendrer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return numberOfStudak == student.numberOfStudak;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberOfStudak);
    }
}
