package com.petproject.ecommerce.service;

import com.petproject.ecommerce.dto.Purchase;
import com.petproject.ecommerce.dto.PurchaseResponse;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);
}
