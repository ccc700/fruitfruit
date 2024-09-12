package com.example.fruit_back.dao;

import com.example.fruit_back.entity.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CartDAO extends JpaRepository<Cart, Integer> {

    public List<Cart> findByMid(int mid);

    public Cart findByMidAndGno(int uid, int gno);
}
