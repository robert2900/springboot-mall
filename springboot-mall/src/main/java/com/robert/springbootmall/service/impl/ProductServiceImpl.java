package com.robert.springbootmall.service.impl;

import com.robert.springbootmall.dao.ProductDao;
import com.robert.springbootmall.model.Product;
import com.robert.springbootmall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Override
    public Product getProductById(Integer productId) {
        return productDao.getProductById(productId);
    }
}
