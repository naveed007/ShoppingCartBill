package com.eshop.test;

import com.eshop.CustomerPurchaseDiscountSlabs;
import com.eshop.CustomerType;
import com.eshop.Discount;
import com.eshop.DiscountSlab;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class RegularCustomerTestData extends RangeData {

    public void loadDiscounts() {
        List<Discount> regularCustomerDiscountRange = Arrays.asList(
                Discount.of(between(BigDecimal.ZERO, new BigDecimal(5_000)), BigDecimal.ZERO), Discount.of(between(new BigDecimal(5_000), new BigDecimal(10_000)), BigDecimal.TEN),
                Discount.of(above(new BigDecimal(10_000)), new BigDecimal(20)));
        DiscountSlab regularCustomerSlab = DiscountSlab.of(regularCustomerDiscountRange);
        CustomerPurchaseDiscountSlabs.addSlab(CustomerType.REGULAR, regularCustomerSlab);
    }

}
