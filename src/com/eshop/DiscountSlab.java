package com.eshop;

import java.math.BigDecimal;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class DiscountSlab {

    private List<Discount> purchaseRangeDiscount;
    private static final Comparator<Discount> DISCOUNT_SORT_COMP = Comparator.comparing(discount -> discount.getPurchaseRange().getMin());

    private DiscountSlab(List<Discount> purchaseRangeDiscount) {
        this.purchaseRangeDiscount = purchaseRangeDiscount.stream().sorted(DISCOUNT_SORT_COMP).collect(Collectors.toList());
    }

    public static DiscountSlab of(List<Discount> purchaseRangeDiscount) {
        return new DiscountSlab(purchaseRangeDiscount);
    }

    public List<Discount> getRangeDiscounts() {
        return purchaseRangeDiscount;
    }

    public BigDecimal applyDiscount(BigDecimal amount) {
        List<Discount> applicableDiscounts = new LinkedList<>();
        Optional<Discount> matchRangeOpt =
                purchaseRangeDiscount.stream().peek(discount -> applicableDiscounts.add(discount)).filter(discount -> discount.isApplicable(amount)).findFirst();
        BigDecimal totalDiscount = BigDecimal.ZERO;
        if (matchRangeOpt.isPresent()) {
            for (Discount discount : applicableDiscounts) {
                totalDiscount = totalDiscount.add(discount.apply(amount));
            }
        }
        return amount.subtract(totalDiscount);
    }

}
