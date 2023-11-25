package EqualsHashCode;

public class Main {
    public static void main(String[] args) {
        Passport passportEvg = new Passport("111","2222","04.01.2005","Е.В.Баулин");
        Passport passportOther = new Passport("122","2222","04.01.2005","Е.В.Баулин");
        if(passportEvg.hashCode() != passportOther.hashCode())
            System.out.println("1)" + false);
        else
            System.out.println(passportEvg.equals("1)"+ passportOther));


        Student studEvg = new Student("Е.В.Баулин",18,1600092,"Attack helicopter");
        Student studOther = new Student("Е.Г.Фаулин",20,1600150,"Мужчина");
        if(studEvg.hashCode() != studOther.hashCode())
            System.out.println("2)"+ false);
        else
            System.out.println(studEvg.equals("2)" + studOther));


        StudentInfo hesitEvg = new StudentInfo(new int[]{50,25,25,40},"01.01.2022","Баулин.Е.В",18,"Man");
        StudentInfo hesitOther = new StudentInfo(new int[]{50,25,25,40},"01.01.2022","Баулин.Е.В",18,"Man");

            System.out.println("3)" + hesitEvg.equals( hesitOther));


            StudentWithPassport studentWithPassportEvg = new StudentWithPassport(studEvg,passportEvg);
            StudentWithPassport studentWithPassportOther = new StudentWithPassport(studOther,passportOther);

            System.out.println("4)" + studentWithPassportEvg.equals(studentWithPassportOther));
        }
    }