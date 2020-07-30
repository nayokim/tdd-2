import java.util.ArrayList;
import java.util.List;

public class Student {
    private long id;
    private String name;
    private ArrayList<Integer> grades;


    public Student (long id, String name){
        this. id = id;
        this. name = name;
        this.grades = new ArrayList<>();

    }


    public String getName(){
         return this.name;
    }

    public long getId(){
        return this.id;
    }

    public void addGrade(int grade){
        this.grades.add(grade);
    }

    public ArrayList<Integer> getGrades(){
       return this.grades;
    }

    public double getAverage(){
        double result = 0;
        for (double grade : grades){
            result += grade;
        }
        return result / getGrades().size();
    }





}
