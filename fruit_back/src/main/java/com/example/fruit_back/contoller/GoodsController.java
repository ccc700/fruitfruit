package com.example.fruit_back.contoller;

import com.example.fruit_back.entity.Goods;
import com.example.fruit_back.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/goods")
public class GoodsController {

    @Autowired
    private GoodsService gs;

    @GetMapping("/list")
    public List<Goods> findAll() {
        return gs.findAll();
    }
}
