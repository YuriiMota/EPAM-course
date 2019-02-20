package com.mota;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class SampleTest {
    private static int count = 0;

    @BeforeAll
    public static void beforeClass() {
        System.out.println("Count beforeClass is : " + count);
    }

    @BeforeEach
    public void beforeTest() {
        System.out.println("Count before is : " + count);
    }

    @AfterEach
    public void afterTest() {
        System.out.println("Count after is : " + count);
    }

    @AfterAll
    public static void afterClass() {
        System.out.println("Count AfterClass is : " + count);
    }

    @Test
    void checkAdd() {
        Sample sample = new Sample(5,6);
        assertEquals(11,sample.add(),"5+6 should return 11");
    }
    @Test
    void checkAddValue() {
        Sample sample = new Sample(5,6);
        assertEquals(15,sample.addToValue1(10),"10+5 should return 15");
    }

    @Test
    void checkBoollean(){
        count++;
        Sample sample = new Sample(5,6);
        assertTrue(sample.isOk());
    }
    @Test
    void checkBoollean2(){
        Sample sample = new Sample(-5,6);
        assertFalse(sample.isOk());
    }

    @Test
    void getAbbracadabra() {
        Sample sample = new Sample(-5,6);
        assertThrows(Exception.class,()->sample.getAbbracadabra(4));
    }
}