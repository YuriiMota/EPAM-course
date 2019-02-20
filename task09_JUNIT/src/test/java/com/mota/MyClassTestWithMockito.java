package com.mota;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;


import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class MyClassTestWithMockito {
    @InjectMocks
    MyClass myClass;
    @Mock
    MyInterface myInterface;

    @Test
    void testAdd() {
        when(myInterface.add(10.00,30.00)).thenReturn(40.00);
        assertEquals(40.00,myClass.add(10.00,30.00));
    }

    @Test
    void testSubtract() {
        when(myInterface.subtract(20.00,10.00)).thenReturn(10.00);
        assertEquals(10.00,myClass.subtract(20.00,10.00),0.00001);

        verify(myInterface).subtract(20.00,10.00);

    }

    @Test
    void multiply() {
        MyInterface myInterface = Mockito.mock(MyInterface.class);
        MyClass myClass = new MyClass(myInterface);
        when(myInterface.multiply(10.00,2.00)).thenReturn(20.00);
        assertEquals(20.00,myClass.multiply(10.00,2.00));
    }

    @Test
    void divide() {
    }
}