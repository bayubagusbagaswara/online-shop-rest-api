package com.bayu.pharmacy.service.impl;

import com.bayu.pharmacy.repository.ProductRepository;
import com.bayu.pharmacy.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

}
