package EqualsHashCode;

import java.util.Objects;

public class Passport {
    private final String numberOfPassport;
    private final String passportSeries;
    private final String bornDate;
    private String fio;

    public Passport(String numberOfPassport, String passportSeries, String bornDate, String fio) {
        this.numberOfPassport = numberOfPassport;
        this.passportSeries = passportSeries;
        this.bornDate = bornDate;
        this.fio = fio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passport passport = (Passport) o;
        return numberOfPassport.equals(passport.numberOfPassport) && passportSeries.equals(passport.passportSeries);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberOfPassport, passportSeries);
    }
}
