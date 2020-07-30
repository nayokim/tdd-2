import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class StudentTest {
    Student nayo;

    @Before
    public void setup(){
        nayo = new Student (1, "Nayoung");
        nayo.addGrade(90);
        nayo.addGrade(80);
        nayo.addGrade(70);
    }

    @Test
    public void ifUserObjectCanBeCreated(){
        assertEquals("Nayoung", nayo.getName());
    }

    @Test
    public void ifUserIdIsCorrect(){
        assertEquals(1, nayo.getId());
    }

    @Test
    public void userAddGrade(){
        assertSame(90,  nayo.getGrades().get(0));
    }

    @Test
    public void testIfAvgCorrect(){
        assertEquals(90, nayo.getAverage(),10 );
    }



}
