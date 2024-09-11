package com.example.fruit_back.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "member")
public class Member {
    @Id
   private String id;
   private String pwd;
   private String name;
   private String email;
   private String tel;
   private String addr;
   private String postcode;
   private String role;
}












