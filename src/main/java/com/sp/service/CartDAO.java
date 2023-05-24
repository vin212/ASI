package com.sp.service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.sp.model.Cart;

@Service
public class CartDAO {

	private List<Cart> cards = new ArrayList<Cart>();

	public int addCart(Cart card) {
		card.setId(cards.size() +1);
		cards.add(card);
		return card.getId();
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
