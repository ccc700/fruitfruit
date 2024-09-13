package com.example.fruit_back.service;

import com.example.fruit_back.dao.GoodsDAO;
import com.example.fruit_back.entity.Goods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsService {

    @Autowired
    GoodsDAO dao;

    public List<Goods> findAll(){
        return dao.findAll();
    }
}
