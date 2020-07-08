package com.eshop;

import java.math.BigDecimal;
import java.util.Objects;

public class ComputeBill {

    public static BigDecimal of(CustomerType type, BigDecimal amount) {
        DiscountSlab slab = CustomerPurchaseDiscountSlabs.getSlab(type);
        if (Objects.isNull(slab)) {
            return amount;
        }
        return slab.applyDiscount(amount);
    }

}
