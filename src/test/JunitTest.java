package test;

import basic.method.Declaration;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JunitTest {
    @Test
    public void testSum(){
        Declaration declaration = new Declaration();
        int sumResult = declaration.add(1,2);
        assertEquals(3, sumResult, 0);
    }
}
