import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class StudentTest {

    Student nayo;
    Student studentWithManyGrades;

    @Before
    public void setUp(){
        nayo = new Student(1, "Nayoung");
        nayo.addGrade(90);
        nayo.addGrade(90);
        nayo.addGrade(90);
    }

    @Test
    public void testId(){
        assertEquals(1, nayo.getId());
    }

    @Test
    public void testName(){
        assertEquals("Nayoung", nayo.getName());
    }

    @Test
    public void testAddGrade(){
        assertSame(90,nayo.getGrades().get(0));
    }


    @Test
    public void testAverages(){
        assertEquals(90,nayo.getAverage(),0);
    }


}
