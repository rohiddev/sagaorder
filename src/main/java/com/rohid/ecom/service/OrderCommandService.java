package com.rohid.ecom.service;

import java.util.concurrent.CompletableFuture;

import com.rohid.ecom.dto.OrderCreateDTO;

public interface OrderCommandService {

    public CompletableFuture<String> createOrder(OrderCreateDTO orderCreateDTO);

}