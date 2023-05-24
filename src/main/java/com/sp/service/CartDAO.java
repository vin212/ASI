package com.sp.service;
import org.springframework.stereotype.Service;

import com.sp.model.Cart;

@Service
public class CartDAO {

      public void addCart(Cart h) {
          System.out.println(h);
      }

      public Cart getCart(int id) {
          Cart c = new Cart(1,"totoro","Polo","Gros bison futé","Grass",55,22,21,50);
    	  return c;
      }

  }
