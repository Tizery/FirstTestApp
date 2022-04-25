package com.example.firsttestapp

import junit.framework.Assert.*
import org.junit.Assert.assertArrayEquals
import org.junit.Assert.assertNotEquals
import org.junit.Test

class VerificationClassTest {

    @Test
    fun equalsString() {
        assertEquals(VerificationClass.obj1, VerificationClass.obj2)
    }

    @Test
    fun notEqualsString() {
        assertNotEquals(VerificationClass.obj1, VerificationClass.obj3)
    }

    @Test
    fun arrayEquals() {
        assertArrayEquals(VerificationClass.obj4, VerificationClass.obj5)
    }

    @Test
    fun isNullString() {
        assertNull(VerificationClass.obj6)
    }

    @Test
    fun isNotNullString() {
        assertNull(VerificationClass.obj6)
    }

    @Test
    fun sameString() {
        assertSame(VerificationClass.obj1, VerificationClass.obj2)
    }

}