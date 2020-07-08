package com.eshop;

import java.util.EnumMap;
import java.util.Map;

public class CustomerPurchaseDiscountSlabs {

    private static final Map<CustomerType, DiscountSlab> CUSTOMER_SLABS = new EnumMap<>(CustomerType.class);

    public static void addSlab(CustomerType type, DiscountSlab slab) {
        CUSTOMER_SLABS.put(type, slab);
    }

    public static DiscountSlab getSlab(CustomerType type) {
        return CUSTOMER_SLABS.get(type);
    }

}
