package com.robert.springbootmall.dao;

import com.robert.springbootmall.model.Product;

public interface ProductDao {

    public Product getProductById(Integer productId);
}
