package com.example.fruit_back.service;

import com.example.fruit_back.dao.CartDAO;
import com.example.fruit_back.entity.Cart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartService {
    @Autowired
    private CartDAO cartDAO;

    // 특정 유저의 장바구니를 검색해서 반환한다
    public List<Cart> listCart(String id){
        return cartDAO.findByMember_id(id);
    }

    // 유저의 장바구니에서 특정 제품의 정보를 반환한다

//    public Cart findByUidandGno(String uid, int gno){
//        return cartDAO.findByMember_idAndGoods_no(uid,gno);
//    }

}
