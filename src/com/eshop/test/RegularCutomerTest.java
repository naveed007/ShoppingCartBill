package com.eshop.test;

import static org.junit.Assert.assertTrue;

import com.eshop.ComputeBill;
import com.eshop.CustomerType;

import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

public class RegularCutomerTest extends RegularCustomerTestData {

    @Before
    public void setUp() throws Exception {
        loadDiscounts();
    }

    @Test
    public void testFiveThousand() {
        BigDecimal billAmount = ComputeBill.of(CustomerType.REGULAR, new BigDecimal(5_000));
        boolean equal = billAmount.compareTo(new BigDecimal(5_000)) == 0 ? true : false;
        assertTrue(equal);
    }

    @org.junit.Test
    public void testTenThousand() {
        BigDecimal billAmount = ComputeBill.of(CustomerType.REGULAR, new BigDecimal(10_000));
        boolean equal = billAmount.compareTo(new BigDecimal(9_500)) == 0 ? true : false;
        assertTrue(equal);
    }

    @Test
    public void testFifteenThousand() {
        BigDecimal billAmount = ComputeBill.of(CustomerType.REGULAR, new BigDecimal(15_000));
        boolean equal = billAmount.compareTo(new BigDecimal(13_500)) == 0 ? true : false;
        assertTrue(equal);
    }

}
