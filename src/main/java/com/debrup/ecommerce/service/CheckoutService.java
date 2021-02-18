package com.debrup.ecommerce.service;

import com.debrup.ecommerce.dto.Purchase;
import com.debrup.ecommerce.dto.PurchaseResponse;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);
}
