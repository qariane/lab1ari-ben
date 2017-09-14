package hw;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Fizzbuzz{

  

  {

    @Test
    public void zero() {
        assertEquals("0", Fizzbuzz.fizzbuzz(0));
    }

    @Test
    public void one() {
        assertEquals("1", Fizzbuzz.fizzbuzz(1));
    }

    @Test
    public void seven() {
        assertEquals("7", Fizzbuzz.fizzbuzz(7));
    }

    @Test
    public void seventeen() {
        assertEquals("17", Fizzbuzz.fizzbuzz(17));
    }

}