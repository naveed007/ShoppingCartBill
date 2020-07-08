package com.eshop;

import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;

public class ShoppingCartApp {

    public static void main(String[] args) {
        /*List<Discount> regularCustomerDiscountRange = new LinkedList<>();
        Range.builder().min(new BigDecimal(5_000)).max(new BigDecimal(10_000)).build();
        regularCustomerDiscountRange.add(Discount.of(Range.between(new BigDecimal(5_000), new BigDecimal(10_000)), BigDecimal.TEN));
        regularCustomerDiscountRange.add(Discount.of(Range.between(BigDecimal.ZERO, new BigDecimal(5_000)), BigDecimal.ZERO));
        regularCustomerDiscountRange.add(Discount.of(Range.between(new BigDecimal(10_000), null), new BigDecimal(20)));
        DiscountSlab regularCustomerSlab = DiscountSlab.of(regularCustomerDiscountRange);
        CustomerPurchaseDiscountSlabs.addSlab(CustomerType.REGULAR, regularCustomerSlab);

        List<Discount> premiumCustomerDiscountRange = new LinkedList<>();
        premiumCustomerDiscountRange.add(Discount.of(Range.between(BigDecimal.ZERO, new BigDecimal(4_000)), BigDecimal.TEN));
        premiumCustomerDiscountRange.add(Discount.of(Range.between(new BigDecimal(8_000), new BigDecimal(12_000)), new BigDecimal(20)));
        premiumCustomerDiscountRange.add(Discount.of(Range.between(new BigDecimal(12_000), null), new BigDecimal(30)));
        premiumCustomerDiscountRange.add(Discount.of(Range.between(new BigDecimal(4_000), new BigDecimal(8_000)), new BigDecimal(15)));

        DiscountSlab premiumCustomerSlab = DiscountSlab.of(premiumCustomerDiscountRange);
        CustomerPurchaseDiscountSlabs.addSlab(CustomerType.PREMIUM, premiumCustomerSlab);

        System.out.println(ComputeBill.of(CustomerType.REGULAR, new BigDecimal(5_000)));
        System.out.println(ComputeBill.of(CustomerType.REGULAR, new BigDecimal(10_000)));
        System.out.println(ComputeBill.of(CustomerType.REGULAR, new BigDecimal(15_000)));

        System.out.println(ComputeBill.of(CustomerType.PREMIUM, new BigDecimal(4_000)));
        System.out.println(ComputeBill.of(CustomerType.PREMIUM, new BigDecimal(8_000)));
        System.out.println(ComputeBill.of(CustomerType.PREMIUM, new BigDecimal(12_000)));
        System.out.println(ComputeBill.of(CustomerType.PREMIUM, new BigDecimal(20_000)));*/
    }

}
