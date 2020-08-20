import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class StudentTest {

    Student nayo;
    Student nayoWithManyGrades;

    @Before
    public void setUp(){
        nayo = new Student(1, "nayo");
        nayo.addGrades(90);
        nayo.addGrades(90);
        nayo.addGrades(90);
    }

    @Test
    public void testId(){
        assertEquals(1, nayo.getId());
    }

    @Test
    public void testName(){
        assertEquals("nayo", nayo.getName());
    }

    @Test
    public void testGrades(){
        assertSame(90,nayo.getGrades().get(0) );
    }

    @Test
    public void testAverages(){
        assertEquals(90, nayo.getAverage(),0);
    }




}
