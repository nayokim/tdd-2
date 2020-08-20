import java.util.ArrayList;
import java.util.List;

public class Student {

    private long id;
    private String name;
    private List<Integer> grades;

    public Student (long id, String name){
        this.id = id;
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public long getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public List<Integer> getGrades(){
        return this.grades;
    }

    public void addGrades(int grades){
        this.grades.add(grades);
    }

    public double getAverage(){
        double result = 0;
        for (int grade: grades){
            result += grade;
        }
        return result / getGrades().size();
    }

}
