package green4ever.ci.pass;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author giao-lang | fb/giao.lang.bis version 20.1121
 */
public class Green4everTest {
    
    @Test
    public void takeFinalExam_GetsAllPass() {
        
        String expected = "A semester with PASS all!!!";
        String actual = "A semester with PASS all!!!";        
        assertEquals(expected, actual);
        
        expected = "GREEN 4EVER <3";
        actual = "GREEN 4EVER <3";
        assertEquals(expected, actual);        
    }
    
}
