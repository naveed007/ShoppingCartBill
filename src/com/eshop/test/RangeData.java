package com.eshop.test;


import com.eshop.Range;

import java.math.BigDecimal;

public class RangeData {
    
    public Range between(BigDecimal min, BigDecimal max) {
        return Range.builder().min(min).max(max).build();
    }

    public Range above(BigDecimal min) {
        return Range.builder().min(min).build();
    }

}
