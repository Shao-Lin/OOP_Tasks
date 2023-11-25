package Interface;

public class Main {
    public static void main(String[] args) {
        Analyst analyst = new Analyst();
        Programmer programmer = new Programmer();
        Tester tester = new Tester();
        Employee employee = new Employee();


        employee.addProgrammer(programmer);
        employee.addAnalyst(analyst);
        employee.addTesters(tester);
    }
}