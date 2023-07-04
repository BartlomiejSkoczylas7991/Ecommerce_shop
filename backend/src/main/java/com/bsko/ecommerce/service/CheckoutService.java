package com.bsko.ecommerce.service;

import com.bsko.ecommerce.dto.Purchase;
import com.bsko.ecommerce.dto.PurchaseResponse;

public interface CheckoutService {
    PurchaseResponse placeOrder(Purchase purchase);
}
