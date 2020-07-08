package com.eshop;

import java.math.BigDecimal;

public class Discount {

    private final Range purchaseRange;
    private final BigDecimal discount;

    private Discount(Range purchaseRange, BigDecimal discount) {
        this.purchaseRange = purchaseRange;
        this.discount = discount;
    }

    public static Discount of(Range purchaseRange, BigDecimal discount) {
        return new Discount(purchaseRange, discount);
    }

    public boolean isApplicable(BigDecimal amount) {
        return purchaseRange.contains(amount);
    }

    public BigDecimal apply(BigDecimal amount) {
        return purchaseRange.diff(amount).multiply(discount.divide(new BigDecimal(100)));
    }

    public Range getPurchaseRange() {
        return purchaseRange;
    }

}
