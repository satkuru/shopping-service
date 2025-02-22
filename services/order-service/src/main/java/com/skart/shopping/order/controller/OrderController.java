package com.skart.shopping.order.controller;

import com.skart.shopping.order.service.api.Product;
import com.skart.shopping.order.service.api.ProductServiceClient;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/v1/orders")
@RequiredArgsConstructor
public class OrderController {

    private final ProductServiceClient serviceClient;

    @GetMapping("/{productId}")
    public ResponseEntity<String> createOrder(@PathVariable String productId){
        Product product = serviceClient.getProductById(productId);
        return ResponseEntity.status(HttpStatus.CREATED).body("Order created for product: "+product.name()+" with price: "+product.price());
    }
}
