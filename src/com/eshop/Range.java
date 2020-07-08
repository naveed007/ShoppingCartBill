package com.eshop;

import java.math.BigDecimal;
import java.util.Objects;

public final class Range {

    private final BigDecimal min;
    private final BigDecimal max;

    private Range(Builder range) {
        this.min = range.min;
        this.max = range.max;
    }

    /*
     * private Range(BigDecimal min, BigDecimal max) { this.min = min; this.max = max; }
     */
    public BigDecimal getMin() {
        return min;
    }

    public BigDecimal getMax() {
        return max;
    }

    public static class Builder {
        private BigDecimal min;
        private BigDecimal max;

        public Builder() {
        }

        public Builder min(BigDecimal min) {
            this.min = min;
            return this;
        }

        public Builder max(BigDecimal max) {
            this.max = max;
            return this;
        }

        public Range build() {
            return new Range(this);
        }
    }

    // public static Range between(BigDecimal min, BigDecimal max) {
    // return new Range(min, max);
    // }
    public static Builder builder() {
        return new Builder();
    }


    public boolean contains(final BigDecimal element) {
        if (element == null) {
            return false;
        }
        if (Objects.isNull(max)) {
            return element.compareTo(min) > -1;
        }
        else {
            return element.compareTo(min) > -1 && element.compareTo(max) < 1;
        }

    }

    public BigDecimal diff(BigDecimal amount) {
        if (Objects.isNull(max)) {
            return amount.subtract(min);
        }
        else {
            return max.subtract(min);
        }

    }
}
