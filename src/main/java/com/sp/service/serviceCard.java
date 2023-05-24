package com.sp.service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.sp.model.Cart;

@Service
public class serviceCard {
	
	private List<Cart> cards = new ArrayList<Cart>();
      
      public void addCart(Cart card) {
    	  Optional<Cart> optional = cards.stream()
                  .filter(x -> x.getId() == card.getId())
                  .findFirst();
			if(!optional.isPresent()) {//Check whether optional has element you are looking for
		    	  cards.add(card);
			}
      }
      
      public Cart getCart(int id) {
    	  Optional<Cart> optional = cards.stream()
                  .filter(x -> x.getId() == id)
                  .findFirst();
			if(optional.isPresent()) {//Check whether optional has element you are looking for
				Cart card = optional.get();//get it from optional
				return card;
			}else {
				return null;
			}    	  
      }

  }
