package com.eshop.test;

import com.eshop.CustomerPurchaseDiscountSlabs;
import com.eshop.CustomerType;
import com.eshop.Discount;
import com.eshop.DiscountSlab;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class PremiumCustomerTestData extends RangeData {

    public void loadDiscounts() {
        List<Discount> premiumCustomerDiscountRange = Arrays.asList(
                Discount.of(between(BigDecimal.ZERO, new BigDecimal(4_000)), BigDecimal.TEN),
                Discount.of(between(new BigDecimal(4_000), new BigDecimal(8_000)), new BigDecimal(15)),
                Discount.of(between(new BigDecimal(8_000), new BigDecimal(12_000)), new BigDecimal(20)), Discount.of(above(new BigDecimal(12_000)), new BigDecimal(30)));
        DiscountSlab premiumCustomerSlab = DiscountSlab.of(premiumCustomerDiscountRange);
        CustomerPurchaseDiscountSlabs.addSlab(CustomerType.PREMIUM, premiumCustomerSlab);
    }

}
