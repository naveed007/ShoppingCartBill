package com.eshop.test;

import static org.junit.Assert.assertTrue;

import com.eshop.ComputeBill;
import com.eshop.CustomerType;

import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

public class PremiumCutomerTest extends PremiumCustomerTestData {

    @Before
    public void setUp() throws Exception {
        loadDiscounts();
    }

    @Test
    public void test4Thousand() {
        BigDecimal billAmount = ComputeBill.of(CustomerType.PREMIUM, new BigDecimal(4_000));
        boolean equal = billAmount.compareTo(new BigDecimal(3_600)) == 0 ? true : false;
        assertTrue(equal);
    }

    @org.junit.Test
    public void tesEightThousand() {
        BigDecimal billAmount = ComputeBill.of(CustomerType.PREMIUM, new BigDecimal(8_000));
        boolean equal = billAmount.compareTo(new BigDecimal(7_000)) == 0 ? true : false;
        assertTrue(equal);
    }

    @Test
    public void testTwelveThousand() {
        BigDecimal billAmount = ComputeBill.of(CustomerType.PREMIUM, new BigDecimal(12_000));
        boolean equal = billAmount.compareTo(new BigDecimal(10_200)) == 0 ? true : false;
        assertTrue(equal);
    }

    @Test
    public void testTwentyThousand() {
        BigDecimal billAmount = ComputeBill.of(CustomerType.PREMIUM, new BigDecimal(20_000));
        boolean equal = billAmount.compareTo(new BigDecimal(15_800)) == 0 ? true : false;
        assertTrue(equal);
    }

}
