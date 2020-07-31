import java.util.ArrayList;
import java.util.List;

public class Student {

    private long id;
    private String name;
    private ArrayList<Integer>grades;


    public Student(long id, String name){
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

    public ArrayList<Integer> getGrades(){
        return this.grades;
    }

    public void addGrade(int grade){
        this.grades.add(grade);
    }

    public double getAverage(){
        double result = 0;

        for (int grade : grades){
            result +=grade;
        }
        return result / this.getGrades().size();
    }



}
