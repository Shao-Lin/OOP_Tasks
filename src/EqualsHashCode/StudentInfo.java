package EqualsHashCode;

import java.util.Arrays;

public class StudentInfo {
    private int[] grade;
    private String dateLastBecame;
    private String fio;
    private int age;
    private String gender;

    public StudentInfo(int[] grade, String dateLastBecame, String fio, int age, String gender) {
        this.grade = grade;
        this.dateLastBecame = dateLastBecame;
        this.fio = fio;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentInfo that = (StudentInfo) o;
        return Arrays.equals(grade, that.grade) && dateLastBecame.equals(that.dateLastBecame) && fio.equals(that.fio);
    }
}
