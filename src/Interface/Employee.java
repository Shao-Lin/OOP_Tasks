package Interface;

import java.util.ArrayList;
import java.util.List;

public class Employee {

    private List<Programmer> programmers = new ArrayList<Programmer>();
    private List<Analyst> analyst = new ArrayList<>();
    private List<Tester> tester = new ArrayList<>();


    public void addProgrammer(Programmer a){
        programmers.add(a);
    }
    public void addAnalyst(Analyst a){
        analyst.add(a);
    }
    public void addTesters(Tester a){
        tester.add(a);
    }
}
