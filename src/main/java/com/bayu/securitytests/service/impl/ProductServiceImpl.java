package com.bayu.securitytests.service.impl;

import com.bayu.securitytests.repository.ProductRepository;
import com.bayu.securitytests.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

}
