package EqualsHashCode;

import java.util.Objects;

public class StudentWithPassport {
    private Student student;
    private Passport passport;

    public StudentWithPassport(Student student, Passport passport) {
        this.student = student;
        this.passport = passport;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentWithPassport that = (StudentWithPassport) o;
        return passport.equals(that.passport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(passport);
    }
}
