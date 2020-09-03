package com.training.vodaphone;

import java.util.List;

public class OrderInfo {

    private long         customerId;
    private List<String> orders;

    public long getCustomerId() {
        return this.customerId;
    }

    public void setCustomerId(final long customerIdParam) {
        this.customerId = customerIdParam;
    }

    public List<String> getOrders() {
        return this.orders;
    }

    public void setOrders(final List<String> ordersParam) {
        this.orders = ordersParam;
    }


}
